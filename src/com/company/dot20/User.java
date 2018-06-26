package com.company.dot20;


public class User {
    protected String name;
    User(String name){
        this.name = name;
    }
    public void sayHi(){
        System.out.println("hi! " + this.name);
    }

}