import java.util.Arrays;
import java.util.Scanner;

public class SortRows {
    public static void rowSort(int[][]a, int r,int c) {
        for(int i=0;i<r;i++){
           Arrays.sort(a[i]);
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
        rowSort(mat, rows, cols);
        
    }
}
