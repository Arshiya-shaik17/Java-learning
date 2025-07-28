import java.util.Scanner;

public class LarSmaND {
    public static void larSma(int[][] a,int r,int c) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!((i==0 && j==0) || (i==0 && j==c-1) || (j==0 && i==r-1) || (i==r-1 && j==c-1))){
                    if (a[i][j]>max){
                        max=a[i][j];
                    }
                    if(a[i][j]<min){
                        min=a[i][j];
                    }
                }
            }
        }
        System.out.println(max+" "+min);   
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
        larSma(mat, rows, cols);
    }
}
