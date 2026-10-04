public class MaxEleInEveryWinK {
    public static void Maxmum (int arr[], int k){
        int left = 0;
        int right = k-1;
       int max = arr[left];
       for(int i=left; i<=right;i++){
        if(arr[i] > max){
            max = arr[i];
        }
       }
        System.out.print(max + " ");
           while (right < arr.length - 1) {

            left++;
            right++;

            max = arr[left];

            // New window ke andar maximum find karo
            for (int i = left; i <= right; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.print(max + " ");
        }
    }
     public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Maxmum(arr, k);
    }
 }

