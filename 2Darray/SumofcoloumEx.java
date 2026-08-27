    // import java.util.*;
// public class numsEX{
//     public static int  nofseven(int n[][]){
//         int sum = 0;
//             for(int i=0; i<n.length; i++){
//                     sum += n[i][0];
//             }
//         System.out.println("Sum = " + sum);
//         return sum;
//     }
//     public static void main(String [] args){
//          int n[][] = {{4,7,8},{8,8,7},{11,4,3}};
//      nofseven(n);

//     }
// }


//transpose of the matrix

import java.util.*;
public class SumofcoloumEx{
    public static void transpose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        //print karne ke liye
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];

        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Original Matrix
        System.out.println("Original Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        transpose(matrix);
    }
}

