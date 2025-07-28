import java.util.Arrays;
import java.util.Scanner;


public class RevRow {
    public static void rowReverse(int[][] a,int rows,int cols ) {
        for (int i=0;i<rows;i++) {
            int l=0,r=rows-1;
            while(l<=r){
                int temp=a[i][l];
                a[i][l]=a[i][r];
                a[i][r]=temp;
                l++;
                r--;
            }  
        }
        for(int i=0;i<rows;i++){
	        System.out.println(Arrays.toString(a[i]));
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
        rowReverse(mat, rows, cols);
    }
}
