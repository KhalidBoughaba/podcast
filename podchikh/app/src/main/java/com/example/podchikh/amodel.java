package com.example.podchikh;

public class amodel {
    String id;
    String title;
    String idcategory;
    String idspeaker;
    String location;
    String category;
    String image;
    String sub_category;

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



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String loaction) {
        this.location = loaction;
    }



    public amodel() {
    }

    public String getIdspeaker() {
        return idspeaker;
    }

    public void setIdspeaker(String idspeaker) {
        this.idspeaker = idspeaker;
    }

  /*  public amodel(String id, String title, String idcategory, String idspeaker,String location) {
        this.id = id;
        this.title = title;
        this.idcategory = idcategory;
        this.idspeaker = idspeaker;
        this.location = location;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(String idcategory) {
        this.idcategory = idcategory;
    }
}
