import java.util.Scanner;

public class CountVoCo {
    public static void counts(char[] str){
        int vc=0;
        int cc=0;
        for(char ch:str){
            if("aeiou".indexOf(ch)!=-1){
                vc++;
            }else{
                cc++;
            }
        }
        System.out.println("vowels count:"+vc);
        System.out.println("consonants count:"+cc);
    }


   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] s=str.toCharArray();
        counts(s);
        
    } 
}
