package com.jlieblich;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!(weekday)||vacation);
    }

    public int sumDouble(int a, int b) {
        if(a == b) {
            return (a+b)*2;
        }
        return a+b;
    }

    public int close10(int a, int b) {
        int A = Math.abs(a-10);
        int B = Math.abs(b-10);
        if(A < B) {
            return a;
        } else if(A > B) {
            return b;
        } else {
            return 0;
        }
    }

    public String frontBack(String str) {
        if(str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1, str.length()-1)
                +str.charAt(0);
    }

    public String notString(String str) {
        if(str.length() < 3) {
            return "not " + str;
        } else if(str.substring(0, 3).equalsIgnoreCase("not")) {
            return str;
        }
        return "not " + str;
    }
}
