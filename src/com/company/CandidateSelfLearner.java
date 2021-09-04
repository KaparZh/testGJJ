package com.company;
//Класс наследник класса Candidate
public class CandidateSelfLearner extends Candidate {

    public CandidateSelfLearner(String name) {
        super(name);
    }

    @Override//Наследование и полиморфизм
    public void hello() {
        System.out.println("hi! My name is " + getName() + "!");
    }

    @Override //Наследование и полиморфизм
    public void describeExperience() {
        System.out.println("I have been learning Java by myself, nobody examined hor through is my knowledge and how good is my code.\n");
    }
}