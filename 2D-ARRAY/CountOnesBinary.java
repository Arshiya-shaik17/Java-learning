import java.util.Arrays;
import java.util.Scanner;

public class CountOnesBinary {
    public static void binarCountOnes(int a[][],int r,int c) {
        int []count=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(a[i][j]%2==0){
                a[i][j]=0;
               } 
               else{
                a[i][j]=1;
                count[i]++;
               } 
            }
            System.out.println();
        }
        System.out.print(Arrays.toString(count));
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
        
        binarCountOnes(mat, rows, cols);
    }
}
