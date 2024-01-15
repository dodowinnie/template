package com.spsm.jianqiao.controller;

import com.spsm.jianqiao.esb.ILocationRecordService;
import com.spsm.jianqiao.pojo.LocationRecord;
import com.spsm.jianqiao.util.HexStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/record")
public class LocationRecordController {


    @Autowired
    private ILocationRecordService recordService;

    @GetMapping("/receive")
    public Object handleData(String message){

        recordService.saveRecord(message);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 2000);
        result.put("msg", "保存成功");
        return result;
    }





}
