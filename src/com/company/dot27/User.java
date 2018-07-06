package com.company.dot27;


final class User {
    protected String name;
    private static final double VERSION = 1.1;

    User(String name){
        this.name = name;
        User.VERSION =1.2;
    }
    public final void sayHi(){
        System.out.println("hi! " + this.name);
    }

}