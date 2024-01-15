package com.spsm.jianqiao.mapper;

import com.spsm.jianqiao.pojo.LocationRecord;
import com.spsm.jianqiao.pojo.LocationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationRecordMapper {
    long countByExample(LocationRecordExample example);

    int deleteByExample(LocationRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocationRecord record);

    int insertSelective(LocationRecord record);

    List<LocationRecord> selectByExample(LocationRecordExample example);

    LocationRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LocationRecord record, @Param("example") LocationRecordExample example);

    int updateByExample(@Param("record") LocationRecord record, @Param("example") LocationRecordExample example);

    int updateByPrimaryKeySelective(LocationRecord record);

    int updateByPrimaryKey(LocationRecord record);
}