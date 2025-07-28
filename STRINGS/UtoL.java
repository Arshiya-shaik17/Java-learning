import java.util.Scanner;

public class UtoL {
    public static void conversion(String str) {
        int n=str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
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
        String str=sc.nextLine();
        conversion(str);
    }
}