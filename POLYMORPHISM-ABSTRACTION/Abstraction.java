//we cant create object for the abstract classes
//a class with atleast one abstract method is called abstract class.
//one abstract class can inherit another abstract class.
/* 
abstract class First{
    int a,b;
    First(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println("SUM: "+(a+b));
    }
    abstract void sub();
    abstract void mul();
}

class Second extends First{
    Second(){
        super(10, 20);
    }
    void sub(){
        System.out.println("SUB: "+(b-a));
    }
    void mul(){
        System.out.println("MUL: "+(a*b));
    }
    
}
public class Abstraction {
    public static void main(String[] args) {
        Second ob=new Second();
        ob.sum();
        ob.sub();
        ob.mul();
    }
}
*/

abstract class First{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
}
abstract class Second extends First{
    void sum(int a,int b){
        System.out.println("SUM: "+(a+b));
    }
    abstract void mul(int a, int b);

}
class Third extends Second{
    void mul(int a,int b){
        System.out.println("MUL: "+(a*b));
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Third ob=new Third();
        ob.sum(100, 200);
        ob.mul(5, 6);
    }
}