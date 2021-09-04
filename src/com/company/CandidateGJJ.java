package com.company;

//Класс наследник класса Candidate
public class CandidateGJJ extends Candidate {

    public CandidateGJJ(String name) {
        super(name);
    }

    @Override//НАследование и полиморфизм
    public void hello() {
        System.out.println("hi! My name is " + getName() + "!");
    }

    @Override//НАследование и полиморфизм
    public void describeExperience() {
        System.out.println("I passed successfully getJavaJob exams and code reviews.\n");

    }
}
