package com.ruff.lesson_3.data;

public class Trial {
    private String name;
    private String difficultLevel;
    private int distance;

    public Trial(String name, String difficultLevel, int distance){
        this.name= name;
        this.difficultLevel =difficultLevel;
        this.distance =distance;
    }
    public String getName(){
        return  name;
    }

    public String getDifficultLevel(){
        return difficultLevel;
    }
    public int getDistance(){
        return  distance;
    }
}
