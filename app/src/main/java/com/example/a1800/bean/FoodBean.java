package com.example.a1800.bean;

import java.io.Serializable;

public class FoodBean implements Serializable {
    private String title;
    private String jianjie;
    private String desc;
    private int picId;

    public FoodBean(String title, String jianjie, String desc, int picId) {
        this.title = title;
        this.jianjie = jianjie;
        this.desc = desc;
        this.picId = picId;
    }

    public FoodBean() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }
}
