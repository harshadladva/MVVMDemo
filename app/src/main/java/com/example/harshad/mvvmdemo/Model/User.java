package com.example.harshad.mvvmdemo.Model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class User {

    @NonNull
    private String username;
    @NonNull
    private String email;
    @NonNull
    private String password;

    public User() {

    }



    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isInputValid(){
        return  !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                !TextUtils.isEmpty(getPassword()) &&
                getPassword().length() > 6;
    }
}

