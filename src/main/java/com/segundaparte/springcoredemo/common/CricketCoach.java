package com.segundaparte.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


//scope_prototype hace que cada instancia del bean este en diferente memoria
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

/*posconstruct    @PostConstruct
    public void doMyStartutStuff(){
        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes, NOW";
    }
}
