package com.company;
//Родительский класс
public abstract class Candidate implements Interface {
    private String name;//Инкапсуляция

    public Candidate (String name) {
        this.name = name;
    }

    //Инкапсуляция
    public String getName() {
        return name;
    }

    public abstract void describeExperience();

}
