import java.util.Scanner;

public class StrRev {
    public static void rev(char[] str) {
        int n=str.length;
        for(int i=0;i<n/2;i++){         //we can also use negative side and stre it in the resultant string
            int temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=(char) temp;

        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char[] str=word.toCharArray();
        rev(str);
    }
}
