package com.company.dot24;


public class User {
     String name;
     int score;
    public User(String name, int score){
        this.name = name;
        this.score =score;
    }

    public int getScore(){//getter
        return this.score;
    }
    public void setScore(int score){//setter
        if(score > 0) {
            this.score = score;
        }

    }
    public void sayHi(){
        System.out.println("hi! " + this.name);
    }

}