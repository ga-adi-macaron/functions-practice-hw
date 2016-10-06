package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if ((weekday != true) || (vacation == true)) { return true;

        } else return false;
    }

    public int sumDouble(int a, int b) {
        int sum;
        if (a != b) { sum = a + b;
        } else { sum = (a+b)*2; }
        return sum;
    }

    public int close10(int a, int b) {
        int valueA = Math.abs(10 - a);
        int valueB = Math.abs(10 - b);
        if (valueA < valueB) {return a;
        } else if (valueB < valueA) {return b;
        } else { return 0;}
    }

    public String notString(String str) {
        String newString;
        boolean modify;
        if (str.length() >= 3) {String firstThree = str.substring(0,3);
            if (firstThree.equals("not")) { modify = false;
            } else { modify = true; }
            if (modify) { newString = "not " + str;
            } else {newString = str;}
        } else { newString = "not " + str; }
        return newString;
    }
    
}
