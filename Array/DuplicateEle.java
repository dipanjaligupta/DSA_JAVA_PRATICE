import java.util.*;
public class DuplicateEle{
    public static boolean DuplicateValues(int n[]){
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<=n.length-1; j++){
                if(n[i] == n[j] ){
                   return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n[] = {1,2,3,4};
       System.out.println(DuplicateValues(n));
    }
}