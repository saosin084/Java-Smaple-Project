package com.company.dot34;

public class MyApp {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t= new Thread(r);
        t.start();


        for(int i = 0;i < 500; i++){
         System.out.print('.');
     }
    }
}
