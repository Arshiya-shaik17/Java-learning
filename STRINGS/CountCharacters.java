import java.util.Arrays;
import java.util.Scanner;

public class CountCharacters {
    public static void count(char[] str) {
        int n=str.length;
        int count=0;
        Arrays.sort(str);
        for(int i = 0;i<n;i++){
           for(int j=i+1;j<n;j++){
                if(str[i]==str[j]){
                count++;
                }
            }
            System.out.println(str[i]+":"+count);
            count=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] s=str.toCharArray();
        count(s);
    }
}
