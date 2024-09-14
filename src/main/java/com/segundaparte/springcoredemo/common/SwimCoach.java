package com.segundaparte.springcoredemo.common;


public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In construction: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warp up";
    }
}
