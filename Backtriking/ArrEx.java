public class ArrEx{
    public static void changeArr(int arr[],int i, int val){
      //base case
    if(i == arr.length){
        PrintArr(arr);
        return;
    }
      //recursion
      arr[i] = val;
      changeArr(arr,i+1,val+1);
      arr[i] = arr[i] - 2;
    }
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr,0,1);//zero means starting index and 1 means value of zero index
        PrintArr(arr);
    }
}