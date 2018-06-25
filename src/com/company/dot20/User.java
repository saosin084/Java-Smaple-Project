package com.company.dot20;


public class User {
    String name;
    User(String name){
        this.name = name;
    }
    void sayHi(){
        System.out.println("hi! " + this.name);
    }

}