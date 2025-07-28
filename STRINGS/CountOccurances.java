import java.util.Scanner;

public class CountOccurances {
    public static void count(String str) {
        int[] count=new int[256];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            count[c]++;
        }
        boolean[] printed=new boolean[256];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!printed[c]){
                System.out.println(c+":"+count[c]);
                printed[c]=true;
                
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        count(s);
    }
}
