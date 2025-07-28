import java.util.Scanner;

public class SumLarSma {
    public static void sum(int a[][],int r,int c) {
        int max=a[0][0];
        int min=a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
                if(a[i][j]<min){
                    min=a[i][j];
                }     
            }
        }
        System.out.println(max+min);       
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
        sum(mat, rows, cols);
    }
}
