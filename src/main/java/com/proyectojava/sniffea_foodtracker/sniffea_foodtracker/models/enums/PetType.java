package com.proyectojava.sniffea_foodtracker.sniffea_foodtracker.models.enums;

public enum PetType {

    DOG("PERRO"),
    CAT("GATO");

    private final String spanishType;

    PetType(String spanishType) {
        this.spanishType = spanishType;
    }

    public String getSpanishType() {
        return spanishType;
    }
}

