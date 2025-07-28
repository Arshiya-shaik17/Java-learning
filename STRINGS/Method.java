public class Method {
    public static void main(String[] args) {
        String str="Arshiya Shaik";
        String str2="Shaik";
        System.out.println("original:"+str);
        System.out.println("length:"+str.length());
        System.out.println("charAt:"+str.charAt(1));
        System.out.println("substring:"+str.substring(2));
        System.err.println("substring(2,7):"+str.substring(2,7));
        System.out.println("to lower case:"+str.toLowerCase());
        System.out.println("toUpperCase:"+str.toUpperCase());
        System.out.println("trim()"+str.trim());
        System.out.println("equals():"+str.equals(str2));
        System.out.println("equalIgnoreCase:"+str.equalsIgnoreCase(str2));
        System.out.println("compareTo:"+str.compareTo(str2));
        System.out.println("contains(\'arsh'):"+str.contains("arsh"));
        System.out.println("replace('i','*'):"+str.replace('y','*'));
        String[] parts=str.trim().split(" ");
        System.out.println("Split(\'\'):First word"+parts[0]+"Second Word:"+parts[1]);
        System.out.println("indexOf(\'y\'):"+str.indexOf('y'));
        System.out.println("lastindexOf('a')"+str.lastIndexOf('a'));
        System.out.println("startsWith(\'ars')"+ str.startsWith("Ars"));
        System.out.println("endsWith('ik'):"+str2.endsWith("ik"));
    }
}
