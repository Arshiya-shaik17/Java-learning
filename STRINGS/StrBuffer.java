public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ARSHIYA");
        sb.append("SHAIK");
        System.out.println("After append: "+sb);
        sb.insert(8,"sk");
        System.out.println("after insert: "+sb);
        sb.replace(0, 5, "arshi");
        System.out.println("after replace: "+sb);
        sb.delete(4, 8);
        System.out.println("after delete: "+sb);
        sb.reverse();
        System.out.println("After reverse:  "+sb);
        String F_str=sb.toString();
        System.out.println("Final string is: "+F_str);

    }
}
