package com.chinasoft.model.entity;

public class Personnelchange {
    private Integer pcid;

    private String username;

    private String changereason;

    private Integer donemark;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getChangereason() {
        return changereason;
    }

    public void setChangereason(String changereason) {
        this.changereason = changereason == null ? null : changereason.trim();
    }

    public Integer getDonemark() {
        return donemark;
    }

    public void setDonemark(Integer donemark) {
        this.donemark = donemark;
    }
}