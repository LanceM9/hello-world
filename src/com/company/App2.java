package com.company;

//didn't have to import Person bc App2 shares the same package as Person

public class App2 {
    //a static method can only call other static methods
    //only one copy of each static method exists

    public static void main(String[] args) {
        Person dude = new Person();
        //dude.name = "The Dude";
        dude.setName("The Dude");

        Person callie = new Person();
        //callie.name = "Callie";
        callie.setName("Callie");

        dude.sayHello();
        callie.sayHello();

        System.out.println("I was born on " + dude.getDate());
        System.out.println("I was born on " + callie.getDate());
    }
}
