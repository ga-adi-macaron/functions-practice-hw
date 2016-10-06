package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum *= 2;
        }
        return sum;
    }

    public int close10(int a, int b) {
        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);
        if (a1 < b1) {
            return a;
        }
        if (b1 < a1) {
            return b;
        }
        return 0;
    }
}
