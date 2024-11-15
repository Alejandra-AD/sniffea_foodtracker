package com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.entities;

public class Location {
    
    private Long id;
    private String storeName;
    private String adress;
    private String coord;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getCoord() {
        return coord;
    }
    public void setCoord(String coord) {
        this.coord = coord;
    }



}
