package com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.entities;

import java.util.List;

import com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.dtos.CommentDTO;
import com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.dtos.LocationDTO;
import com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.dtos.UserDTO;
import com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.enums.PetType;

public class Food {

    private Long id;
    private String brand;
    private PetType petType; //evaluar si será un enum*
    private Double price;
    private LocationDTO location;
    private UserDTO user;
    private List<CommentDTO>comment;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public PetType getPetType() {
        return petType;
    }
    public void setPetType(PetType petType) {
        this.petType = petType;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocationDTO getLocation() {
        return location;
    }
    public void setLocation(LocationDTO location) {
        this.location = location;
    }
    public UserDTO getUser() {
        return user;
    }
    public void setUser(UserDTO user) {
        this.user = user;
    }
    public List<CommentDTO> getComment() {
        return comment;
    }
    public void setComment(List<CommentDTO> comment) {
        this.comment = comment;
    }

    

}

