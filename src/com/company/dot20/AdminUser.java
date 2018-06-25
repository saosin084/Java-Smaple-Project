package com.company.dot20;

public class AdminUser extends User {
    AdminUser(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("hello! " + this.name);
    }
    //override
    @Override
    void sayHi(){
        System.out.println("[admin] hi! " + this.name);
    }
}
