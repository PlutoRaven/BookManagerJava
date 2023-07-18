package com.example.bookmanagerjava.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private String id;
    @SerializedName("fullName")
    private String fullName;
    @SerializedName("image")
    private String image;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("role")
    private int role;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }
}
