class First{
    int a=10;
    void sum(){
        System.out.println(a);
    }
}
class Second extends First{
    int c=15;
    void product(){
        System.out.println(c*a);
    }
}

public class InheritanceSimple {
    public static void main(String[] args) {
        Second ob=new Second();
        ob.product();
        ob.sum();
        
    }
}
