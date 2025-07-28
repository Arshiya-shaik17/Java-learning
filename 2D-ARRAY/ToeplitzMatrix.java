import java.util.Scanner;

public class ToeplitzMatrix {
    public static void isToeplitz(int a[][], int r,int c) {
        int flag=1;
        for(int i=0;i<r/2;i++){
            for(int j=0;j<c/2;j++){
                if(a[i][j]!=a[i+1][j+1]){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
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
        
        isToeplitz(mat, rows, cols);
    }
}
