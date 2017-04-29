package com.chinasoft.model.entity;

public class Candidate {
    private Integer candidateid;

    private String username;

    private String candidatename;

    private String department;

    private String position;

    private String candidateinfo;

    private Integer candidatemark;

    public Integer getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(Integer candidateid) {
        this.candidateid = candidateid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename == null ? null : candidatename.trim();
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

    public String getCandidateinfo() {
        return candidateinfo;
    }

    public void setCandidateinfo(String candidateinfo) {
        this.candidateinfo = candidateinfo == null ? null : candidateinfo.trim();
    }

    public Integer getCandidatemark() {
        return candidatemark;
    }

    public void setCandidatemark(Integer candidatemark) {
        this.candidatemark = candidatemark;
    }
}