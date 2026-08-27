// //BRUTE FORCE SOLUTIONS     
// import java.util.*;
// public class MaxSumArr {
//     public static void maxsumarray(int nums[]) {
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++) {
//             int start = i;
//             for(int j = i; j < nums.length; j++) {
//                 int end = j;
//                 currsum = 0;
//                 for(int k = start; k <= end; k++) {
//                     currsum += nums[k];
//                 }
//                 System.out.println(currsum);

//                 if(maxsum < currsum) {
//                     maxsum = currsum;
//                 }
//             }
//         }

//         System.out.println("max sum = " + maxsum);
//     }

//     public static void main(String[] args) {

//         int nums[] = {2, 4, 6, 8, 10};

//         maxsumarray(nums);
//     }
// }
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}