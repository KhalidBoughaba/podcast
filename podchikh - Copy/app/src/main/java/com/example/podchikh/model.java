package com.example.podchikh;

public class model {
    String id, category, image;

    public model() {
    }

    public model(String id, String category, String image) {
        this.id = id;
        this.category = category;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
