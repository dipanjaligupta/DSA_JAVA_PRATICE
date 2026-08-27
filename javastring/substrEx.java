// public class substrEx{
// public static String subString(String str, int si, int ei){
//     String substr = "";
//     for(int i=si; i<ei; i++ ){
//         substr += str.charAt(i);
//     }
//     return substr;
// }
// public static void main(String args[]){
//     String str = "helloWorld";
//     System.out.println(subString(str,0,5));
// }
// }

public static void main(String args[]){
    String fruits[] = {"apple", "mango","banana"};
    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
    }
    System.out.println(largest);
}