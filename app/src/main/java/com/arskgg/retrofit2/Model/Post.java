package com.arskgg.retrofit2.Model;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private int id;
    private String title;

    @SerializedName("body")   //Change name of json key
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
