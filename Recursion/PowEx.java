// public class PowEx {
//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         // int xml = power(x,n-1);
//         // int xn = x*xml;
//         // return xn;
//         return x* power(x,n-1);
//     }
//     public  static void main(String[] args){
//         // int a = 2;
//         // int n = 10;
//         System.out.println(power(2,10));
//     }
// }

// public class PowEx{
//     public static int optimizedPower(int a,int n){
//         if(n == 0){
//             return 1;
//         }
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowersq = halfPower * halfPower;
//         // n is odd 
//         if(n % 2 != 0){
//             halfPowersq = a* halfPowersq;
//         }
//         return halfPowersq;
//     }
//     public  static void main(String[] args){
//          int a = 2;
//          int n = 10;
//        System.out.println(power(2,10));
     }
}