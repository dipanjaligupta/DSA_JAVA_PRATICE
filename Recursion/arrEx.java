// public class arrEx{
//     public static int lastOccurence(int arr[], int i,int key){
//        if(i == arr.length){
//         return -1;
//        }
//        int isFound = lastOccurence(arr,i+1,key);
//        if(isFound == -1 && arr[i] == key){
//         return i;
//        }
//        return isFound;
//     }
//     public static void main(String [] args){
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         System.out.println(lastOccurence(arr,0,5));
//     }
// }

public class arrEx{
    public static void Alloccu(int arr[], int i, int key){
        if(i == arr.length){
        return;
       }
       if(arr[i] == key){
       System.out.print(i);
       }
       Alloccu(arr,i+1,key);
       return;
    }
    public static void main(String [] args){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        Alloccu(arr,0,2);
    }

}