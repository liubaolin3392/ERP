package com.chinasoft.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Trainplan {
    private Integer trainplanid;

    private String traindirect;

    private String trainobject;

    private String traincontent;

    private Date trainstarttime;

    private String traincontinuetime;

    private String traininfo;

    private String trainplace;

    private BigDecimal trainprice;

    public Integer getTrainplanid() {
        return trainplanid;
    }

    public void setTrainplanid(Integer trainplanid) {
        this.trainplanid = trainplanid;
    }

    public String getTraindirect() {
        return traindirect;
    }

    public void setTraindirect(String traindirect) {
        this.traindirect = traindirect == null ? null : traindirect.trim();
    }

    public String getTrainobject() {
        return trainobject;
    }

    public void setTrainobject(String trainobject) {
        this.trainobject = trainobject == null ? null : trainobject.trim();
    }

    public String getTraincontent() {
        return traincontent;
    }

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    public Date getTrainstarttime() {
        return trainstarttime;
    }

    public void setTrainstarttime(Date trainstarttime) {
        this.trainstarttime = trainstarttime;
    }

    public String getTraincontinuetime() {
        return traincontinuetime;
    }

    public void setTraincontinuetime(String traincontinuetime) {
        this.traincontinuetime = traincontinuetime == null ? null : traincontinuetime.trim();
    }

    public String getTraininfo() {
        return traininfo;
    }

    public void setTraininfo(String traininfo) {
        this.traininfo = traininfo == null ? null : traininfo.trim();
    }

    public String getTrainplace() {
        return trainplace;
    }

    public void setTrainplace(String trainplace) {
        this.trainplace = trainplace == null ? null : trainplace.trim();
    }

    public BigDecimal getTrainprice() {
        return trainprice;
    }

    public void setTrainprice(BigDecimal trainprice) {
        this.trainprice = trainprice;
    }
}