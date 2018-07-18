package com.company.dot27;


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
