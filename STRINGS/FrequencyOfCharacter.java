import java.util.Scanner;

public class FrequencyOfCharacter {
     public static void frequency(String str) {
        int[] freq=new int[256];
        char result=' ';
        int max=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
            if(freq[ch]>max){
                max=freq[ch];
                result=ch;
            }
        }
        System.out.println(str);
        System.out.println(result);
        System.out.println(max);

     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        frequency(s);
    }
}
