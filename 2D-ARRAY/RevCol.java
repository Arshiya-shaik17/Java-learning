import java.util.Arrays;
import java.util.Scanner;

public class RevCol {
    public static void colReverse(int[][] a,int rows,int cols ) {
        for (int j=0;j<cols;j++) {
            int u=0,d=cols-1;
            while(u<=d){
                int temp=a[u][j];
                a[u][j]=a[d][j];
                a[d][j]=temp;
                u++;
                d--;
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
        colReverse(mat, rows, cols);
    }
}


