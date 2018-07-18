package com.company.dot27;

public class AdminUser extends User {
    AdminUser(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("hello! " + this.name);
    }
}
