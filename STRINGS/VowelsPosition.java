import java.util.Scanner;

public class VowelsPosition {
     public static void countPrint(String str) {
        int n = str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1){
                for (int j = 0; j <i; j++) {
                    result += ch;
                }
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        countPrint(str);
        
        
    }
}
