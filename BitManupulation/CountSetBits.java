//COUNT SET BITS IN A NUM ? Google
public class CountSetBits{
 public static int countsetBit(int n){
    int count = 0;
    while(n > 0){
        if((n & 1) !=0 ){//check our lsb
        count++;
        }
     n = n>>1;
    }
    return count;
 }
 public static void main(String  args[]){
    System.out.println(countsetBit(15));
 }
}