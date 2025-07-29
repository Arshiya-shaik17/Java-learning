import java.util.Scanner;
public class  Pattern19
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<=n-1;i++){
	        for(int j=i;j<=n-1;j++){
                System.out.print(" ");   
	           
	        }
            for(int j=1;j<=2*i+1;j++){
                System.out.print(( j==1 ||j==2*i+1)?"*":" ");  
            }

	        System.out.println("");	
	    }
        for(int i=n;i>=0;i--){
	        for(int j=1;j<=n-i;j++){
                System.out.print(" ");   
	           
	        }
            for(int j=1;j<=2*i+1;j++){
                System.out.print(( j==1 ||j==2*i+1)?"*":" "); 
            }

	        System.out.println("");	
	    }
        
	
	}
}

