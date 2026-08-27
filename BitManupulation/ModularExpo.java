public class ModularExpo{
    public static long  ModularExponention(long a, long n ,long mod){
        long ans = 1;
        while(n > 0){
            if( (n & 1) !=0 ){
                ans = (ans * a) % mod;
            }
       a = (a * a) % mod;
        n = n >> 1;
     }
  return ans;

    }
    public static void main(String [] args){
        System.out.println(ModularExponention(3,13,7));
    }
}