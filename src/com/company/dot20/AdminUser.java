package com.company.dot20;

public class AdminUser extends User {
    AdminUser(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("hello! " + this.name);
    }
    //override
    @Override
    public void sayHi(){
        System.out.println("[admin] hi! " + this.name);
    }
}
