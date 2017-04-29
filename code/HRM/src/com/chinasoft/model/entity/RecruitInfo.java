package com.chinasoft.model.entity;

import java.util.Date;

public class Recruitinfo {
    private Integer recruitid;

    private String department;

    private String position;

    private Date recruitstarttime;

    private Integer recruitnum;

    private Date recruitendtime;

    private Date republictime;

    public Integer getRecruitid() {
        return recruitid;
    }

    public void setRecruitid(Integer recruitid) {
        this.recruitid = recruitid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getRecruitstarttime() {
        return recruitstarttime;
    }

    public void setRecruitstarttime(Date recruitstarttime) {
        this.recruitstarttime = recruitstarttime;
    }

    public Integer getRecruitnum() {
        return recruitnum;
    }

    public void setRecruitnum(Integer recruitnum) {
        this.recruitnum = recruitnum;
    }

    public Date getRecruitendtime() {
        return recruitendtime;
    }

    public void setRecruitendtime(Date recruitendtime) {
        this.recruitendtime = recruitendtime;
    }

    public Date getRepublictime() {
        return republictime;
    }

    public void setRepublictime(Date republictime) {
        this.republictime = republictime;
    }
}