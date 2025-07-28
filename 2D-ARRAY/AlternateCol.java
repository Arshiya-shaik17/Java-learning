import java.util.Scanner;

public class AlternateCol {
    public static void revAlternate(int a[][],int r,int c) {
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j-=2){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
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
        revAlternate(mat, rows, cols);
    }
}
