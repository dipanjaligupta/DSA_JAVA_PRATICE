//Amaomng 
public class Tilingpro{
    public static int tiling(int n){// 2 x n (floor size)
    //base case 
    if(n == 0 || n == 1){
        return 1;
    }
    //kaam
    //vertical 
    int fnm1 = tiling(n-1);

    //horizontal 
    int fnm2 = tiling(n-2);

    int totalways = fnm1 + fnm2;
    return totalways;

    }
    public static void main(String args[]){
        System.out.println(tiling(n));
    }
}