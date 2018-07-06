package com.company.dot26;


public class User {
     private String name;
     private static int count;

     static{
         User.count = 0;
         System.out.println("Static initializer");
     }

    {
        System.out.println("Instance initializer");
    }


    public User(String name){
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }
    public static void getInfo(){
    System.out.println("# of instances" + User.count);

    }
    public void sayHi(){
        System.out.println("hi! " + this.name);
    }

}