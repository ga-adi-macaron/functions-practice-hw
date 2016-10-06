package com.bleh;

public class Main {

    public int close10(int a, int b) {
        int difA = Math.abs(a-10);
        int difB = Math.abs(b-10);

        if (difA < difB){
            return a;
        }
        if (difB < difA){
            return b;
        }
        else{
            return 0;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b){
            sum=sum * 2;
        }
        return sum;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }else
            return false;
    }










}


