import java.util.Scanner;

public class LongestString {
    public static void subString(String str) {
        String longest="";
        String current="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(current.indexOf(c)!=-1){
                current=current.substring(current.indexOf(c)+1);
            }
            current+=c;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.println(str);
        System.out.println(longest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        subString(s);
    }
}
