package com.example.harshad.mvvmdemo.Model;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("title")
    public String title;

    @SerializedName("image")
    public String imageUrl;


    public Movie() {
    }

    public Movie( String title, String imageUrl ) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl ) {
        this.imageUrl = imageUrl;
    }
}
