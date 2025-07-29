/* 
interface First{
    abstract void display();
    abstract void print();
}
class Second implements First{
    public void display(){
        System.out.println("First method");
    }
    public void print(){
        System.out.println("Second method");
    }
}
public class Interface {
    public static void main(String[] args) {
        Second ob=new Second();
        ob.display();
        ob.print();
    }    
}
*/


//extending an interface
/* 
interface First{
    abstract void sum(int a,int b);
}
interface Second extends First{
    abstract void mul(int a, int b);
}
interface Third extends Second{
    abstract void sub(int a, int b);
}
class Four implements Third{
    public void sum(int a,int b){
        System.out.println("SUM: "+(a+b));
    }
    public void mul(int a,int b){
        System.out.println("MUL: "+(a*b));
    }
    public void sub(int a,int b){
        System.out.println("SUB: "+(a-b));
    }
}

public class Interface{
    public static void main(String[] args) {
        Four ob=new Four();
        ob.sum(5,6);
        ob.mul(25, 35);
        ob.sub(100, 0200);
    }
}

*/

//implementing multiple interfaces

interface First{
    abstract void display();
}
interface Second{
    abstract void display();
}
interface Third{
    abstract void display();
}
class Four implements First ,Second,Third{
    public void display(){
        System.out.println("MULTIPLE INHERITANCE");
    }
}
public class Interface{
    public static void main(String[] args) {
        Four ib=new Four();
        ib.display();
    }
}