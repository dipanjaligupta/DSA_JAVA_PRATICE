import java.util.*;
public class RevrEx{
    public static String revEle(String str){
        String rev = "";
        for(int i=str.length() - 1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
       return rev;
    }
    public static void main(String [] args){
        String result = revEle("dipa");
        System.out.println(result);
    }
}