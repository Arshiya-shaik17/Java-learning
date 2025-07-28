import java.util.Arrays;
import java.util.Scanner;

public class SortCol {
    public static void colSort(int[][]a, int r,int c) {
        for(int j=0;j<c;j++){
           int[] temp=new int[r];
           for(int i=0;i<r;i++){
                temp[i]=a[i][j];
           }
           Arrays.sort(temp);
           for(int i=0;i<r;i++){
            a[i][j]=temp[i];
           }
        }
        System.out.println(Arrays.deepToString(a));
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
        colSort(mat, rows, cols);
        
    }
}
