package com.company;

public class Main {

    public static void main(String[] args) {

        //#1
        public boolean sleepIn(boolean weekday, boolean vacation) {
            if (!weekday || vacation) {
                return true;
            }
            return false;
        }

        //#2

        public int sumDouble(int a, int b) {
            int sum = a + b;
            if (a == b) {
                sum = sum * 2;
            }
            return sum;
        }

        //#3

        public int close10(int a, int b) {
            int valueA = Math.abs(a - 10);
            int valueB = Math.abs(b - 10);

            if (valueA < valueB) {
                return a;
            }
            else if (valueB < valueA) {
                return b;
            }
            return 0;
        }
    }
}
