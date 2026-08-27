// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class SwapNumEx{
    //o(n)
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String [] args){
     ArrayList<Integer> list = new ArrayList<>();
      list.add(1);//0
      list.add(8);//1
      list.add(9);//2
      list.add(5);//3
    // int idx1 = 1, idx2 = 3;
    // System.out.println(list);
    // swap(list,idx1,idx2);
    System.out.println(list);
    Collections.sort(list);
     System.out.println(list);

    }
}