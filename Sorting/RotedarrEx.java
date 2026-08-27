// public class RotedarrEx{
//     public static int serach(int arr[], int tar,int si,int ei){
//         if(si > ei){
//             return -1;
//         }
//         //kaam
//         int mid = si + (ei-si)/2;
//  ////case found
//         if(arr[mid] == tar){
//             return mid;
//         }
//         //mid on L1
//         if(arr[si] <= arr[mid]){
//             //case a : left
//             if(arr[si] <= tar && tar<=arr[mid]){
//                 return serach(arr,tar,si,mid-1);
//             }else{
//               //  case : b
//                return serach(arr,tar,mid+1,ei);
//             }
//         }
//         // mid on l2
//         else{
//             //case : c
//            if(arr[mid] <= tar && tar<= arr[ei]){
//             return serach(arr,tar,mid+1,ei);
//            }else{
//             //left
//             return serach(arr,tar,si,mid-1);
//            }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;//output -> 4;
//         int tarIdx = serach(arr,target,0,arr.length-1);
//         System.out.println(tarIdx);

//     }
// }

// //bubbles short
// import java.util.*;
// public class RotedarrEx{
//     public static void Bulles(int arr[]){
//         for(int turn = 0; turn<arr.length-1;turn++){
//             int count = 0;
//             for(int j = 0; j<arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     count++;
//                 }
//             }
//             if(count == 0){
//                 break;
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String [] args){
//         int arr[] = {1,2,3,4};
//         Bulles(arr);
//         printArr(arr);
        
//     }
// }
//Selection short 
// public class RotedarrEx{
//     public static void Selections(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int curr = i;
//             for(int j = i + 1; j<arr.length; j++){
//                 if(arr[curr] > arr[j]){
//                     curr = j;
//                 }
//             }
//             //swap
//             int temp = arr[curr];
//             arr[curr] = arr[i];
//             arr[i] = temp;
//         }
//     }
//      public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//          }
//         System.out.println();
//    }
//     public static void main(String args[]){
//         int arr[] = {1,4,5,2,3};
//         Selections(arr);
//         printArr(arr);
//     }
// }
//insertion short
// for(int i=1; i<arr.length;i++){
//     int curr = arr[i];
//     int prev = i-1;
//     //finding out the correct pos to insert
//     while(prev >=0 && arr[prev] > curr){
//         arr[prev + 1] = arr[prev];
//         prev--;
//     }
//     arr[prev+1] = curr;
// }
//by using iterations
// public class RotedarrEx{
//     public static int rotedArr(int arr[], int tar, int si,int ei){
//         while(si <= ei){
//             int mid = (si + ei) / 2;
//             if(arr[mid] == tar){
//                 return mid;
//             }
//            if(arr[si] <= arr[mid]){
//             if(arr[si] <= tar && tar<=arr[mid]){
//                ei = mid - 1;
//             }else{
//               si = mid + 1;
//             }
//            }else{
//             if(arr[mid] <= tar && tar <= arr[ei]){
//                 si = mid + 1;
//             }else{
//                 ei = mid - 1;
//             }
//            }
//         }
//         return tar;
//     }
//     public static void main(String [] args){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;
//      int idex  =  rotedArr(arr,target,0,arr.length-1);
//      System.out.println(idex);
//     }
// }

// public  class RotedarrEx {
//     public static int binarysearch(int arr[] , int si ,int ei,int key){
//         while(si <= ei){
//             int mid = (si+ei) / 2;
//             if(arr[mid] == key){
//                 return key;
//             }
//             if(arr[mid] < key){
//                 si = mid + 1;
//             }else{
//                 ei = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String [] args){
//         int arr[] = {1,2,3,4,5};
//        int key = 3;
//         int rel = binarysearch(arr,0,arr.length-1,key);
//         System.out.println(rel);
//     }
// }
//  while(si <= ei){
//     int mid = (si+ei) / 2;
//     if(arr[mid] == key){
//         return mid;
//     }
//     if(arr[si] <= arr[mid]){
//         if(arr[si] <= key && key <= arr[mid]){
//             ei = mid - 1;
//         }else{
//             si = mid + 1;
//         }
//     }else{
//         if(arr[mid] <= key && key <= arr[ei]){
//             si = mid + 1;
//         }else{
//           ei = mid - 1;
//         }
//     }
//  }
































// public class RotedarrEx{
//     public class int rotedArr(int arr[], int tar, int si, int,ei){
//         if(ar)
//         int mid = (si + ei) / 2;
//         if(arr[mid] == key){
//             return mid;
//         }
//        //left
//         if(arr[si] <= arr[mid]){
//             // case a,b
//             if(arr[si] <= tar && tar <= arr[mid]){
//              return serach(arr,tar,si,mid-1);
//             }else{
//             return serach(arr,tar,mid+1,ei);
//             }
//         }else{
//             if(arr[mid] <= tar && tar <=arr[ei]){
//                 return serach(arr,tar,mid+1,ei)
//             }else{
//                  return serach(arr,tar,si,mid-1);
//             }
//         }


//     }
// }