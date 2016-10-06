package com.justin;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public int sumDouble(int a, int b) {
        if (a==b)
            return (4 * a);

        return (a + b);
    }

    public int close10(int a, int b) {
        if (Math.abs(10-a) > Math.abs(10-b))
            return b;
        else if (Math.abs(10-a) < Math.abs(10-b))
            return a;

        return 0;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!vacation){
            if(weekday)
                return false;
            return true;
        }

        return true;

    }
}
