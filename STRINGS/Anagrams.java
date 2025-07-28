import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void isAnagram(char[] str1,char[] str2) {
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            System.out.println("FALSE");
        }
        else{
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1, str2)){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char[] s1=str1.toCharArray();
        String str2=sc.nextLine();
        char[] s2=str2.toCharArray();
        isAnagram(s1, s2);
    }
}
