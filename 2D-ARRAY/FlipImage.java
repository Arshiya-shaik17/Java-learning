import java.util.Arrays;
import java.util.Scanner;

public class FlipImage {
    public static void flipMat(int[][] a,int r,int c ) {
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.println((a[i][j]^1)+"");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int cols=sc.nextInt();
        int [][]mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        
        flipMat(mat, rows, cols);
    }
}
