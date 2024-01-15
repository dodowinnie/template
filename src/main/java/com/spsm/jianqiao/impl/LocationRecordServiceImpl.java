package com.spsm.jianqiao.impl;

import com.spsm.jianqiao.esb.ILocationRecordService;
import com.spsm.jianqiao.mapper.LocationRecordMapper;
import com.spsm.jianqiao.pojo.LocationRecord;
import com.spsm.jianqiao.util.HexStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Date;

@Service
public class LocationRecordServiceImpl implements ILocationRecordService {

    @Autowired
    private LocationRecordMapper locationRecordMapper;

    @Override
    public int saveRecord(String message) {
        LocationRecord locationRecord = convertToRecord(message);
        return locationRecordMapper.insertSelective(locationRecord);
    }

    private LocationRecord convertToRecord(String message){
        // tagNo
        String tagNoStr = message.substring(18, 22);
        tagNoStr = HexStringUtil.littleToBig(tagNoStr);
        int tagNoInt = Integer.parseInt(tagNoStr, 16);
        String tagNo = String.valueOf(tagNoInt);

        // 主基站id
        String anchorNoStr = message.substring(22, 26);
        anchorNoStr = HexStringUtil.littleToBig(anchorNoStr);
        int anchorNoInt = Integer.parseInt(anchorNoStr, 16);
        String anchorNo = String.valueOf(anchorNoInt);

        // x坐标
        String xPosStr = message.substring(30, 38);
        xPosStr = HexStringUtil.littleToBig(xPosStr);

        long xPos = getPosition(xPosStr);
        BigDecimal xPosDecimal = new BigDecimal(xPos);
        // 小数点左移2位 cm->m，暂定网格10cm，四舍五入
        xPosDecimal = xPosDecimal.movePointLeft(2);
        BigDecimal xPosCurrent = xPosDecimal.setScale(1, RoundingMode.HALF_UP);
        // y坐标
        String yPosStr = message.substring(38, 46);
        yPosStr = HexStringUtil.littleToBig(yPosStr);
//					long yPos = Long.parseLong(yPosStr, 16);
        long yPos = getPosition(yPosStr);
        BigDecimal yPosDecimal = new BigDecimal(yPos);
        yPosDecimal = yPosDecimal.movePointLeft(2);
        BigDecimal yPosCurrent = yPosDecimal.setScale(1, RoundingMode.HALF_UP);
        // z坐标
        String zPosStr = message.substring(46, 54);
        zPosStr = HexStringUtil.littleToBig(zPosStr);
//					long zPos = Long.parseLong(zPosStr, 16);
        long zPos = getPosition(zPosStr);
        BigDecimal zPosDecimal = new BigDecimal(zPos);
        zPosDecimal = zPosDecimal.movePointLeft(2);
        BigDecimal zPosCurrent = zPosDecimal.setScale(1, RoundingMode.HALF_UP);

        // 时间戳
        String timeStr = message.substring(54, 62);
        timeStr = HexStringUtil.littleToBig(timeStr);
        Long time = Long.parseLong(timeStr, 16);
        // 毫秒值
        String millSecondStr = message.substring(62, 66);
        millSecondStr = HexStringUtil.littleToBig(millSecondStr);
        Integer millSecond = Integer.parseInt(millSecondStr, 16);
        // 整合时间
        Long totalTime = time * 1000l + millSecond;

        // 电池电压
//		String powerStr = message.substring(66);
//		powerStr = HexStringUtil.littleToBig(powerStr);
//		Integer power = Integer.parseInt(powerStr, 16);
//		// 除100
//		BigDecimal powerDecimal = new BigDecimal(power).movePointLeft(2);

        // 组装保存数据
        LocationRecord record = new LocationRecord();
        record.setPosX(xPosCurrent);
        record.setPosY(yPosCurrent);
        record.setPosZ(zPosCurrent);
        record.setTagNo(tagNo);
        record.setAnchorNo(anchorNo);
        Date date = new Date(totalTime);
        record.setTime(date);
        return record;
    }

    private Long getPosition(String hex) {
        long position = 0;
        // 取第一位
        int bit1Num = Integer.parseInt(hex.substring(0, 1), 16);// 获取第一位。判断是正数还是负数
        if (bit1Num < 8) { // 小于8是正数
            position = Long.parseLong(hex, 16);
        } else { // 负数
            position = new BigInteger(hex, 16).intValue();
        }
        return position;
    }


}
