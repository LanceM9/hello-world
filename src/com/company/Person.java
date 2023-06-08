package com.company;

import java.util.Date;

public class Person {

    //this should not be accessible
    //with "private", now only by using a method of the class can
    //this be adjusted

    private String name; //this is a state
                        //private means that only methods inside
                        //the class can access it
    private Date createdDate;

    Person() {
        this.name = "Unknown";
        this.createdDate = new Date();
    }

    Person (String name) {
        this.name = name;
        this.createdDate = new Date();
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Date getDate() {
        return createdDate;
    }

    //this is a behaviour
    public void sayHello() {
        System.out.println("Hello I am " + this.name);
    }

    //never create psvm inside a class definition

    //an interface defines a set of methods that must be defined
    //by the class that implements said interface.
    //This is called implementing the interface
    //an interface is the skeleton of a class 
}

