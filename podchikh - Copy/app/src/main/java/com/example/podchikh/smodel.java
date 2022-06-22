package com.example.podchikh;

public class smodel {
    String id, sub_category, image;

    public smodel() {
    }

    public smodel(String id, String sub_category, String image) {
        this.id = id;
        this.sub_category = sub_category;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
