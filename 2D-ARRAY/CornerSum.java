import java.util.Scanner;

public class CornerSum {
    public static void cSum(int[][]a ,int r,int c) {
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    sum=a[0][0]+a[0][c-1]+a[r-1][0]+a[r-1][c-1];
                
            }
        }
        System.out.println(sum);
        
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
        cSum(mat, rows, cols);
        
    }
}
