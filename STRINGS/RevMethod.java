import java.util.Scanner;

public class RevMethod {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String word=sc.next();
        
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        System.out.println(sb);
        
    }
}
