package com.example.cameracodeexample.utils;

public class LocalResponse {
    String image;
    int uid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalResponse(String image, int uid) {
        this.image = image;
        this.uid = uid;
    }
}
