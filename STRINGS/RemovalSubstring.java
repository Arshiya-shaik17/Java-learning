import java.util.Scanner;

public class RemovalSubstring {
    public static void removing(String str,String substr) {
        if(str.indexOf(substr)!=-1){
            String s=str.replace(substr, "");
            System.out.println(s);
        }
        else{
            System.out.println("NO SUBSTRING FOUND");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss=sc.nextLine();
        removing(s,ss);
    }
}
