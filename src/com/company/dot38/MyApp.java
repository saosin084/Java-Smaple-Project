package com.company.dot38;

import java.util.Random;

public class MyApp {
    public static void main(String[] args) {
        double d = 53.234;

        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        System.out.println(Math.PI);

        Random r = new Random();
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextBoolean());

    }
}
