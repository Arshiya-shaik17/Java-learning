import java.util.Scanner;

public class PalindromeStr {
    public static void palindrome(char[] str) {
        int n=str.length;
        char[] fi=str;
        for(int i=0;i<n/2;i++){         //we can also use negative side and stre it in the resultant string
            int temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=(char) temp;

        }
            if(str.equals(fi)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] s=str.toCharArray();
        palindrome(s);
        
    }
}
