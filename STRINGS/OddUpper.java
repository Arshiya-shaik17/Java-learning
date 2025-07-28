import java.util.Scanner;

public class OddUpper {
    public static void vowelDifference(String str) {
        int n=str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(i%2==0){
                result+=Character.toLowerCase(ch);
            }
            else{
                result+=Character.toUpperCase(ch);
            }
         }
         System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        vowelDifference(str);    
    } 
}
