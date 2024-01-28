package com.example.retro;



public class ServicesList
{
    int id;
    String title;
    String desig;
    String image;

    public ServicesList() {
    }

    public ServicesList(int id, String title, String desig, String image) {
        this.id = id;
        this.title = title;
        this.desig = desig;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public String getDesig() {
        return desig;
    }


    public String getImage() {
        return image;
    }

}
