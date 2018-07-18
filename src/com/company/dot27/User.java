package com.company.dot27;


class User {
    protected String name;
    private static double VERSION = 1.1;

    User(String name){
        this.name = name;
        User.VERSION =1.2;
    }
    public void sayHi(){
        System.out.println("hi! " + this.name);
    }

}