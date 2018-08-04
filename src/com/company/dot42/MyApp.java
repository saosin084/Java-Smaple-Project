package com.company.dot42;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {

        List<Integer> sales = new ArrayList<>(Arrays.asList(12,30,22,4,9));

        //for(Integer sale : sales){
       //     System.out.println(sale);
        //}
        sales
                .stream()
                .filter(e -> e % 3 ==0)
                .map(e -> "(" + e + ")" )
                .forEach(System.out::println);


    }
}
