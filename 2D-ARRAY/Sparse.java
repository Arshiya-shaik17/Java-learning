import java.util.Scanner;

public class Sparse {
    public static void isSparse(int a[][] ,int rows,int cols) {
        int total=rows*cols;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]==0){
                    count++;
                }
            }
        }
        if(count>(total/2)){
            System.out.println("Sparse Matrix");
        }
        else{
            System.out.println("Not sparse matrix");
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
        isSparse(mat, rows, cols);
    }
}
