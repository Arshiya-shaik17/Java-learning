
import java.util.Scanner;
public class  Pattern12
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int num=1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print((char)(num+64)+" ");
                num+=1;
	           
	        }
	        System.out.println("");	
	    }
	
	}
}

