package com.korbkenny;

public class Main {

    public static void main(String[] args) {

    }

    //~~~ Problem 1 ~~~//
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    //~~~ Problem 2 ~~~//

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        else {
            return a + b;
        }

    }


    //~~~ Problem 3 ~~~//

    public int close10(int a, int b) {
        if (Math.abs(a-10)>Math.abs(b-10)){
            return b;
        }
        else if (Math.abs(a-10)<Math.abs(b-10)){
            return a;
        }
        else {return 0;}
    }






}
