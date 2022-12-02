package com.example.a1800.bean;

import java.io.Serializable;

public class FoodbelongBean implements Serializable {
    String belong;
    int sriId;
    String content;

    public FoodbelongBean(String belong, int sriId, String content) {
        this.belong = belong;
        this.sriId = sriId;
        this.content = content;
    }

    public FoodbelongBean() {
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public int getSriId() {
        return sriId;
    }

    public void setSriId(int sriId) {
        this.sriId = sriId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
