public class FastExponention{
    public static int FastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) !=0 ){//check lsb;
                ans = ans *a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String [] args){
        System.out.println(FastExpo(3,4));
    }
}

// int power(int a, int n) {
//     int ans = 1;

//     for (int i = 1; i <= n; i++) {
//         ans = ans * a;
//     }

//     return ans;
// }