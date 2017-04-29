package com.chinasoft.model.entity;

public class Contract {
    private Integer contractid;

    private String username;

    private String contractname;

    private String contracttype;

    private String contractcontect;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname == null ? null : contractname.trim();
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    public String getContractcontect() {
        return contractcontect;
    }

    public void setContractcontect(String contractcontect) {
        this.contractcontect = contractcontect == null ? null : contractcontect.trim();
    }
}