 import java.util.*;
public class LargestNumArray {
    public static int getSecondLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }

            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 10, 3, 5};

        System.out.println("Second Largest = " + getSecondLargest(numbers));
    }
}
//paris
// public class LargestNumArray{
//   public static void printParis(int nums[]){
//      int totalpair = 0;
//     for(int i = 0; i<nums.length; i++){
//         int curr = nums[i];
//         for(int j=i+1; j<nums.length; j++){
//             System.out.print("( " + curr + "," + nums[j] + ")");
//              totalpair++;
//         }
//         System.out.println();
//     }
//         System.out.println(totalpair);
//   }
// public static void main(String args[]){
//     int nums[] = {2,4,6,8,10};
//    printParis(nums);
    
// }
// }
//Subarray
public class LargestNumArray{
    public static void printsub(int nums[]){
        int totalsubarr = 0;
        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                 totalsubarr++;
                for(int k=start; k<=end; k++){
                    System.out.print(nums[k] + "");
                  
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(totalsubarr);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        printsub(nums);
    }
}
// Level 1: Basic Array Questions
// Array ke elements print karo.
// Array ka sum nikalo.
// Array ka average nikalo.
// Largest element find karo.
// Smallest element find karo.
// Even numbers count karo.
// Odd numbers count karo.
// Positive aur negative numbers count karo.
// Kisi element ko search karo (Linear Search).
// Array ko reverse print karo.
// Level 2: Intermediate Questions
// Array ko reverse karo.
// Second largest element find karo.
// Second smallest element find karo.
// Maximum aur minimum ka difference nikalo.
// Array me kisi element ki frequency count karo.
// Duplicate elements find karo. 
// Unique elements print karo.
// Array sorted hai ya nahi check karo.
// Missing number find karo (1 se n tak).
// Binary Search implement karo.                               