package com.company.dot26;

//import com.company.dot20.*;

public class MyApp {
    public static void main(String[] args) {
        User.getInfo();//0
        User tom = new User("tom");
        User.getInfo();//1
        User bob = new User("bob");
        User.getInfo();//2
    }
}
