package com.spsm.jianqiao.esb;

import com.spsm.jianqiao.pojo.LocationRecord;

public interface ILocationRecordService {

    /**
     * 保存位置记录
     * @param message
     * @return
     */
    int saveRecord(String message);
}
