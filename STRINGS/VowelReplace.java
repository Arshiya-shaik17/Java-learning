import java.util.Scanner;

public class VowelReplace {
    public static void replaceVowel(String str){
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
               str=str.replace(str.charAt(i),'@');
            }else{
                
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        replaceVowel(str);
    }
}
