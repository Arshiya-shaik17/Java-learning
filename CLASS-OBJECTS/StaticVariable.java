class Two {
    static String name="Arshiya";
    static int rollno=98;
    static double marks=99;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
}


public class StaticVariable {
    public static void main(String[] args) {
        Two s1=new Two();
        System.out.println(s1.name);
    }
}
