import java.util.Scanner;

public class FirstUpper {
    public static void conversion(String str) {
        String[] array = str.split(" ");
        StringBuilder result=new StringBuilder();
       
        for(String w:array){
            if(!w.isEmpty()){
                char f=Character.toUpperCase(w.charAt(0));
                String l=w.substring(1).toLowerCase();
                result.append(f).append(l).append(" ");
            }
        }
         System.out.println(result.toString().trim());  
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        conversion(str);
    }

}
