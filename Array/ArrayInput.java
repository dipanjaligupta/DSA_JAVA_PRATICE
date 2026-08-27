// import java.util.*;

// public class ArrayInput{
//     public static void main(String args[]){
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         System.out.println("phy = " + marks[0]);
//          System.out.println("chem = " + marks[0]);
//           System.out.println("maths = " + marks[0]);
//           int percentage = (marks[0] + marks[1] + marks[2] /3);
//           System.out.println("percentage = " + percentage + "%");
//     }
// }
// import java.util.*;
// public class ArrayInput{
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97,98,99};
//         update(marks);
//         //print marks
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
    
// }

//reversr of array 
// public class ArrayInput{
//     public static void reversr(int arr[] , int i){
//         int n = arr.length;
//         if(i>= n/2 ){
//             return;
//         }
//          int temp = arr[i];
//          arr[i] = arr[n-i-1];
//          arr[n-i-1] = temp;
//          reversr(arr,i+1);
//     }
//     public static void main(String [] args){
//         int arr[] = {1,2,3,4,5};
//         reversr(arr,0);
//     }


// }


// public class Solution {

//     static String[] words = {
//         "zero","one","two","three","four",
//         "five","six","seven","eight","nine"
//     };

//     public static void numToStr(int n) {
//         if(n == 0) return;

//         int digit = n % 10;
//         numToStr(n / 10);

//         System.out.print(words[digit] + " ");
//     }
// }

// public class ArrayInput{
//     public static int mxEle(int arr[]){
//      int max = Integer.MIN_VALUE;
//      for(int i=0; i<arr.length; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//      }
//      return max;
//     }
//     public static void main(String[] args){
//         int arr[] = {1,4,5,8};
//         System.out.print(mxEle(arr));
//     }

