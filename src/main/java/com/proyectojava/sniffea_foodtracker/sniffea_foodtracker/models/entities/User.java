package com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.entities;

import java.time.LocalDate;
import java.util.List;

import com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.dtos.FoodDTO;

public class User {

    private Long userId;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private LocalDate regDate;
    private List <FoodDTO> foodList;


    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getRegDate() {
        return regDate;
    }
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
    public List<FoodDTO> getFoodList() {
        return foodList;
    }
    public void setFoodList(List<FoodDTO> foodList) {
        this.foodList = foodList;
    }
  

}
