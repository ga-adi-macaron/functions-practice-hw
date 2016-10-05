package com.joelimyx;

public class Main {
//    1)

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (weekday && vacation) || vacation || !weekday;
    }

//    2)
    public int sumDouble(int a, int b) {
        return (a == b ) ?( (a+b)*2 ): (a+b);
    }

//    3)
    public int close10(int a, int b) {
        if (Math.abs(a-10) == Math.abs(b-10))
            return 0;
        return (Math.abs(a-10)>Math.abs(b-10)) ? b : a;
    }

//    Bonus
//    4)
    public String frontBack(String str) {
        if(str.length() == 0)
            return "";
        String last = str.charAt(str.length()-1)+"";
        String first = str.charAt(0)+"";
        return last + str.substring(1,str.length()-2) + first;
    }
//    5)
    public String frontBack(String str) {
        if(str.length() == 0)
            return "";
        if(str.length() == 1)
            return str;
        String last = str.charAt(str.length()-1)+"";
        String first = str.charAt(0)+"";
        return last + str.substring(1,str.length()-1) + first;
    }


    public static void main(String[] args) {
	// write your code here
    }
}
