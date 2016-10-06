import java.util.ArrayList;

/**
 * Created by Scott Lindley on 10/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday||vacation){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        int sum = a+b;
        if(a==b){
            sum=sum*2;
        }
        return sum;
    }

    public int close10(int a, int b) {
        if(Math.abs(a-10)<Math.abs(b-10)){
            return a;
        }else if(Math.abs(a-10)>Math.abs(b-10)){
            return b;
        }else{
            return 0;
        }
    }

    public static String frontBack(String str){
        ArrayList<Character> strArray = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            strArray.add(str.charAt(i));
        }
        char last = strArray.get(strArray.size()-1);
        char first = strArray.get(0);
        strArray.remove(strArray.size()-1);
        strArray.add(first);
        strArray.remove(0);
        strArray.add(0, last);
        String result = "";
        for(Character c: strArray){
            result += c.toString();
        }
        return result;
    }

    public static String notString(String str){
        String lowerStr = str.toLowerCase();
        if(lowerStr.charAt(0)=='n'&&lowerStr.charAt(1)=='o'&&lowerStr.charAt(2)=='t'){
            return str;
        }else{
            return "not "+str;
        }
    }
}
