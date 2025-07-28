import java.util.Scanner;

public class CountOfConsonants {
    public static void consonantCount(char[] str) {
        int count=0;
        for(int i=0;i<str.length;i++){
            if(!(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')){
                System.out.print(str[i]+" ");
                count++;

            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char[] str=word.toCharArray();
        consonantCount(str);
    }
}
