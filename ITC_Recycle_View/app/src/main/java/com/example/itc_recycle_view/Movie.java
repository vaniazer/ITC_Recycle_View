package com.example.itc_recycle_view;

public class Movie {
    private String title;
    private String tags;
    private String image;

    public Movie(String title, String tags, String image){
        this.title = title;
        this.tags = tags;
        this.image = image;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
