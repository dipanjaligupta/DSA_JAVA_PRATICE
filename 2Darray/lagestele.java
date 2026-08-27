import java.util.*;
public class lagestele{
    public static void Setmatrixzero (int matrix[][]) {
        int[] row = new int[3];
        int[] col = new int[4];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0 ){
                   row[i] = 1;
                   col[j] = 1;
                }
            }
        }
          for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
               if(row[i] == 1 || col[j] == 1){
                matrix[i][j] = 0;
               }
            }
        }
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][4];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
         Setmatrixzero(matrix);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}