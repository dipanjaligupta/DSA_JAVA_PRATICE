import java.util.ArrayList;

public class ArrayslistEx{
    public static void main(String args[]){
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //PRINT REVERSE OF THE ARRAYLIST
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //particular index pe add 
        // list.add(1,9);
        // System.out.println(list.size());
        //print array list
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }
         //Get operations
        // int ele = list.get(2);
        // System.out.println(ele);
        // Remove Ele
        // list.remove(3);
        //set
        // list.set(2,10);
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

    }
}