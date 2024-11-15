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

}

