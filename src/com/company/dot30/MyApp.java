package com.company.dot30;
enum Result{
    SUCCESS,
    ERROR,
}
public class MyApp {
    public static void main(String[] args) {
        Result res;

        res = Result.ERROR;

        switch(res){
            case SUCCESS:
            System.out.println("OK!");
            System.out.println(res.ordinal());
            break;
            case ERROR:
            System.out.println("NG!");
            System.out.println(res.ordinal());
            break;
        }


    }
}
