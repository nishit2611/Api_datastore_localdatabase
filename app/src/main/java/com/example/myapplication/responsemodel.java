package com.example.myapplication;

public class responsemodel
{
   String id,title,desig,image;

    public responsemodel() {
    }

    public responsemodel(String id, String title, String desig, String image) {
        this.id = id;
        this.title = title;
        this.desig = desig;
        this.image = image;
    }

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

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
