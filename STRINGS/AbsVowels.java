import java.util.Scanner;

public class AbsVowels {
     public static int vowelDifference(String str) {
        int n = str.length();
        int count1 = 0, count2 = 0;
        str = str.toLowerCase();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                if (i < n / 2) {
                    count1++; 
                } else {
                    count2++; 
                }
            }
        }

        return Math.abs(count1 - count2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(vowelDifference(str));
        
        
    } 
}
