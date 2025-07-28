import java.util.Scanner;

public class XMatrix {
    public static void isXMat(int [][]a,int r,int c) {
        int flag=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j || i+j==c-1){
                    if(a[i][j]==0){
                        flag=0;
                        break;
                    }
                }
                else{
                    if(a[i][j]!=0){
                        flag=0;
                        break;
                    }
                }    
            }
        } 
        if(flag==1){
            System.out.println("X Matrix");
        }
        else{
            System.out.println("Not X matrix");
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
        isXMat(mat, rows, cols);
        
    }

}
