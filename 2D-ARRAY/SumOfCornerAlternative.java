import java.util.Scanner;

public class SumOfCornerAlternative {
     public static void sumCornersALternate(int a[][],int r,int c) {
        int sum=0;
        for(int i=0;i<r;i+=2){
            sum+=a[i][0]+a[i][c-1];
        }
        System.out.print(sum);
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
        
        sumCornersALternate(mat, rows, cols);
    }
}
