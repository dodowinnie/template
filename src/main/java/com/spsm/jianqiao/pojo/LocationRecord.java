package com.spsm.jianqiao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LocationRecord implements Serializable {
    private Long id;

    private String tagNo;

    private String anchorNo;

    private BigDecimal posX;

    private BigDecimal posY;

    private BigDecimal posZ;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }

    public String getAnchorNo() {
        return anchorNo;
    }

    public void setAnchorNo(String anchorNo) {
        this.anchorNo = anchorNo == null ? null : anchorNo.trim();
    }

    public BigDecimal getPosX() {
        return posX;
    }

    public void setPosX(BigDecimal posX) {
        this.posX = posX;
    }

    public BigDecimal getPosY() {
        return posY;
    }

    public void setPosY(BigDecimal posY) {
        this.posY = posY;
    }

    public BigDecimal getPosZ() {
        return posZ;
    }

    public void setPosZ(BigDecimal posZ) {
        this.posZ = posZ;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}