package com.chinasoft.model.entity;

public class Trainapply {
    private Integer trainapplyid;

    private String username;

    private String traindirect;

    private String trainleader;

    private Integer trainmark;

    private String trainevaluation;

    private String trainfeedback;

    public Integer getTrainapplyid() {
        return trainapplyid;
    }

    public void setTrainapplyid(Integer trainapplyid) {
        this.trainapplyid = trainapplyid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTraindirect() {
        return traindirect;
    }

    public void setTraindirect(String traindirect) {
        this.traindirect = traindirect == null ? null : traindirect.trim();
    }

    public String getTrainleader() {
        return trainleader;
    }

    public void setTrainleader(String trainleader) {
        this.trainleader = trainleader == null ? null : trainleader.trim();
    }

    public Integer getTrainmark() {
        return trainmark;
    }

    public void setTrainmark(Integer trainmark) {
        this.trainmark = trainmark;
    }

    public String getTrainevaluation() {
        return trainevaluation;
    }

    public void setTrainevaluation(String trainevaluation) {
        this.trainevaluation = trainevaluation == null ? null : trainevaluation.trim();
    }

    public String getTrainfeedback() {
        return trainfeedback;
    }

    public void setTrainfeedback(String trainfeedback) {
        this.trainfeedback = trainfeedback == null ? null : trainfeedback.trim();
    }
}