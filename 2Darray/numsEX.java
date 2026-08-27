// import java.util.*;
// public class numsEX{
//     public static int  nofseven(int n[][]){
//         int sum = 0;
//             for(int j=0; j<n[0].length; j++){
//                     sum += n[2][j];
//             }
//         System.out.println("Sum = " + sum);
//         return sum;
//     }
//     public static void main(String [] args){
//          int n[][] = {{4,7,8},{8,8,7},{11,4,3}};
//      nofseven(n);

//     }
// }
import java.util.*;
public class numsEX{
public static void main(String args[]){
        int matrix[][] = new int [3][3];
      //  int n = 3; m = 3;
      int n = matrix.length , m = matrix[0].length;
//input of the elements
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output of the elsements
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

