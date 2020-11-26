package com.example.javaarchunit.space;

import lombok.Data;

@Data
@Mike
public class SpaceShip {
    private String model;
    private Integer fuel;

    public void applyAirpressure(){
        System.out.println("sjuusssshhh");
    }
}
