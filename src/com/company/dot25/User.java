package com.company.dot25;


public class User {
     private String name;
     private static int count = 0;

    public User(String name){
        this.name = name;
        User.count++;
    }
    public static void getInfo(){
    System.out.println("# of instances" + User.count);

    }
    public void sayHi(){
        System.out.println("hi! " + this.name);
    }

}