package com.company.dot40;

import java.util.*;

public class MyApp {

    public static void main(String[] args) {

        //HashSet<Integer> sales = new HashSet<>();
        Set<Integer> sales = new HashSet<>();

        sales.add(10);
        sales.add(20);
        sales.add(30);
        sales.add(10);

        System.out.println(sales.size());

        for(Integer sale : sales){
            System.out.println(sale);
            }
         sales.remove(30);
        for(Integer sale : sales){
            System.out.println(sale);
        }

    }

}
