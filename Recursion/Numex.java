// public class Numex{
//     // public static void printDec(int n){
//     //     if(n==1){
//     //         System.out.println(n);
//     //         return;
//     //     }
//     //     System.out.println(n+ "");
//     //     printDec(n-1);
//     // }
//     public static void printlnc(int n){
//         if(n == 1){
//             System.out.print(n+ " ");
//             return;
//         }
//         printlnc(n-1);
//         System.out.print(n+ " ");
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printlnc(n);
//     }
// }
// // Understand recursion by print something N times
// ex-dipa
// public class Numex{
//     public void printname(int n ){
//         if(n == 0){
//             return;
//         }
//         System.out.println("dipa");
//         printname(n-1);
//     }
// }
// 
// public class Numex {
//     public int NnumbersSum(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n + NnumbersSum(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(NnumbersSum(n));
//     }
// }
//
//Reverse an array
// public class Numex{
//     public void arrNum( int [] arr, int first ,int last,int n){
//      if(first >= last ){
//         return;
//      }
//      int temp = arr[last];
//      arr[last] = arr[first];
//      arr[first] = temp;
//      arrNum(arr,first+1,last - 1,);
//     }
//     public static void main(String [] args){
//     arrNum(arr,0,arr.length-1);
//     }
// }
// class Solution {   
//     public boolean palindromeCheck(String s,int i) {
//         int n = s.length();
//         if( i >= s.length()/2){
//             return true;
//         }
//         if(s.charAt(i) != s.charAt(n-i-1)){
//             return false;
//         }
//    return palindromeCheck(s,i+1);
    
//         //your code goes here
//     }

public class Numex{
    public static boolean ishortet(int arr[] , int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] >  arr[i+1]){
            return false;
        }
        return ishortet(arr,i+1);
    }
}

