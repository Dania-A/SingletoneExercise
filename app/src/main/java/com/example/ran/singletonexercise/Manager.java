package com.example.ran.singletonexercise;


public class Manager {
    //As a hint we provided you with private fields below and the private constructor, you'll complete the rest
    private String name;
    private double salary;
    private static Manager managerObject = null;


    private Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //TODO: Implement the static method to allow the initialization of one object only

    //TODO: Implement the setters and getters for the name and salary of the singleton object

}
