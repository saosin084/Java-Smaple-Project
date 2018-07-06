package com.company.dot27;

import com.company.dot20.AdminUser;
//import com.company.dot20.*;

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("tom");
                System.out.println(tom.name);
        tom.sayHi();
        AdminUser bob = new AdminUser("bob");
        System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello() ;
    }
}
