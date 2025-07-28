import java.util.Arrays;
import java.util.Scanner;

public class DiffOfDiag {
    public static void diffDiagonals(int a[][],int rows,int cols ) {
        int[] d=new int[rows];
        int[] od=new int[rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if (i==j){
                d[i]=a[i][j];
               }
               if(i+j==rows-1){
                od[i]=a[i][j];
               }
            }
        }
        for(int i=0;i<rows;i++){
            d[i]=d[i]-od[i];
        }

        System.out.println(Arrays.toString(d));
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
        diffDiagonals(mat, rows, cols);
    }
}
