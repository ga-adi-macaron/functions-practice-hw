package NikitaS;

public class Main {

    public static void main(String[] args) {


        //Coding bat Exercise 1 (Sleeping in)----------------http://codingbat.com/prob/p187868

        public boolean sleepIn(boolean weekday, boolean vacation) {
            if (!weekday||vacation){
                return true;
            }
            return false;
        }

        //Coding bat Exercise 2 (Double sum if same)-----------------------http://codingbat.com/prob/p154485

        public int sumDouble(int a, int b) {
            if (a == b){
                return (a+b)*2;
            }
            return (a+b);
        }

        //Coding bat exercise 3 (Distance from 10)---------------------------http://codingbat.com/prob/p172021

        public int close10(int a, int b) {
            int aDist = Math.abs(10-a);
            int bDist = Math.abs(10-b);
            if (aDist == bDist){
                return 0;
            } else if (aDist < bDist){
                return a;
            }else {
                return b;
            }

        }


//  ***BONUS***

        //Coding bat bonus exercise (frontback)-------------------------------http://codingbat.com/prob/p123384

        public String frontBack(String str) {
            if (str.length() == 1 || str.length() ==0){
                return str;
            }
            char head = str.charAt(0);
            char tail = str.charAt(str.length()-1);
            String body = str.substring(1, str.length()-1);
            String newString = String.valueOf(tail) + body + String.valueOf(head);
            return newString;

        }

        //Coding bat bonus exercise (Not)----------------------------------------http://codingbat.com/prob/p191914
        public String notString(String str) {
            if (str.length()<3){
                return "not " +str;
            }else if (str.substring(0,3).equals("not")){
                return str;
            }
            return "not "+str;
        }




    }

}
