//Code 1

public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday = false || vacation != true) {
        return true;
        }

        return false;

        }



// Code 2

public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int add = a + b;

        // Double it if a and b are the same
        if (a == b) {
        add = add * 2;
        }

        return add;
        }


// Code 3

public int close10(int a, int b) {
        if (Math.abs (10-a) > Math.abs(10-b)){
        return b;
        }

        else if (Math.abs (10 - a) < Math.abs(10-b)){
        return a;
        }
        return 0;
        }
