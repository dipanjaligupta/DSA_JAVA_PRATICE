public class MaximumSumSubarr{
    public static  double Maximum(int arr[],int k,int threshold){
      int winSum = 0;
      int left = 0;
      int count = 0;
      int right = k - 1;
      for(int i=left; i<=right; i++){
        winSum += arr[i];
      }
      
       double maxAvg = (double) winSum / k;
      while(right < arr.length - 1){
        left++;
        right++;
        
        winSum = winSum - arr[left-1];
        winSum = winSum + arr[right];
        double avg = (double) winSum / k;
         maxAvg = Math.max(maxAvg, avg);
         if(maxAvg >= threshold){
          count++;
         }
      
      }
      return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int threshold = 3;
        System.out.println(Maximum(arr,k,threshold));
    }
}