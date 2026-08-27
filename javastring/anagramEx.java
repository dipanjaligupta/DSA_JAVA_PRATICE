import java.util.*;
public class anagramEx{
    public static void main(String[] args){
  String str1 = "anagram";
  String str2 = "nagaram";
  str1 = str1.toLowerCase();
  str2 = str2.toLowerCase();

if(str1.length() == str2.length()){
    char[] str1charArray = str1.toCharArray();
    char[] srt2charArray = str2.toCharArray();
    Arrays.sort(str1charArray);
    Arrays.sort(srt2charArray);

    boolean result = Arrays.equals(str1charArray,srt2charArray);
    if(result){
        System.out.println("yes");
    }else{
        System.out.println("not");
    }
}else{
    System.out.println("nots");
 }
 }
}