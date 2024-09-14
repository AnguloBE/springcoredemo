package com.segundaparte.springcoredemo.rest;

import com.segundaparte.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

/*    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }*/

    /*@Autowired
    public void setCoach(@Qualifier("baseballCoach") Coach theCoach){
        myCoach = theCoach;
    }*/

    @Autowired
    public void setCoach(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }



}
