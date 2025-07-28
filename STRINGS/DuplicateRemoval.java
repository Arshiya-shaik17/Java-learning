import java.util.Scanner;

public class DuplicateRemoval {
    public static void duplicate(char[] str) {
        String res="";
        for(char ch:str){
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char[] str=word.toCharArray();
        duplicate(str);
    }
}
