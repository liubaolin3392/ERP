package com.chinasoft.model.entity;

import java.math.BigDecimal;

public class Salary {
    private Integer sid;

    private BigDecimal username;

    private BigDecimal basewage;

    private BigDecimal housefund;

    private BigDecimal oldagefund;

    private BigDecimal medicalfund;

    private BigDecimal reimbursement;

    private BigDecimal unemploymentfund;

    private BigDecimal award;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public BigDecimal getUsername() {
        return username;
    }

    public void setUsername(BigDecimal username) {
        this.username = username;
    }

    public BigDecimal getBasewage() {
        return basewage;
    }

    public void setBasewage(BigDecimal basewage) {
        this.basewage = basewage;
    }

    public BigDecimal getHousefund() {
        return housefund;
    }

    public void setHousefund(BigDecimal housefund) {
        this.housefund = housefund;
    }

    public BigDecimal getOldagefund() {
        return oldagefund;
    }

    public void setOldagefund(BigDecimal oldagefund) {
        this.oldagefund = oldagefund;
    }

    public BigDecimal getMedicalfund() {
        return medicalfund;
    }

    public void setMedicalfund(BigDecimal medicalfund) {
        this.medicalfund = medicalfund;
    }

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }

    public BigDecimal getUnemploymentfund() {
        return unemploymentfund;
    }

    public void setUnemploymentfund(BigDecimal unemploymentfund) {
        this.unemploymentfund = unemploymentfund;
    }

    public BigDecimal getAward() {
        return award;
    }

    public void setAward(BigDecimal award) {
        this.award = award;
    }
}