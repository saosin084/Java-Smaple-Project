package com.company.dot27;

import com.company.dot20.User;

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
