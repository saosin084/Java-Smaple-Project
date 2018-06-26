package com.company.dot24;

//import com.company.dot20.*;

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("tom",65);
                tom.setScore(85);
                tom.setScore(-22);
        System.out.println(tom.getScore());

    }
}
