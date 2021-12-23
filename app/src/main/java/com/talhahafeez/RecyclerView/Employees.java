package com.talhahafeez.RecyclerView;

public class Employees {
    private int id;
    private int imageID;
    private String name;


    public Employees(int id, String name, int imageID) {
        this.id = id;
        this.name = name;
        this.imageID = imageID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
