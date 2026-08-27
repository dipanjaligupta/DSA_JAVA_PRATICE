public class BubbleSortEx{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1] ){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {1,4,5,2,3};
        bubbleSort(arr);
        printArr(arr);
    }
}

//optimize bubble short
// public class BubbleshortEx{
//     public static void bubbleSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             boolean swap = false;
//             for(int j=0; j<arr.length-1-i; j++){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 swap = true;
//             }
//         }
//         if(swap == false){
//                 break;
//           }
//     }
// }