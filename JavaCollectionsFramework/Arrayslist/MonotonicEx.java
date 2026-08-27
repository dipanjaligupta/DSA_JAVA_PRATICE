import java.util.ArrayList;
public class MonotonicEx{
    public static boolean MonoArraylist(ArrayList<Integer>list){
        boolean inc = true;
        boolean dec = true;
        int n = list.size();
        for(int i=0; i<n-1; i++){
           if(list.get(i) > list.get(i + 1)){
               inc = false;
           }
           if(list.get(i) <  list.get(i+1)){
             dec = false;
           }
        }
        return inc || dec;
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println(MonoArraylist(list));
    }
}