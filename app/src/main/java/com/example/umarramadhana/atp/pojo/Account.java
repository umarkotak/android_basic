package com.example.umarramadhana.atp.pojo;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("name")
    public String name;
    @SerializedName("email")
    public String email;
    @SerializedName("noktp")
    public String noktp;
    @SerializedName("address")
    public String address;
    @SerializedName("nohp")
    public String nohp;
    @SerializedName("username")
    public String username;
    @SerializedName("password")
    public String password;

    public Account(String name, String email, String noktp, String address, String nohp, String username, String password) {
        this.name = name;
        this.email = email;
        this.noktp = noktp;
        this.address = address;
        this.nohp = nohp;
        this.username = username;
        this.password = password;
    }

}