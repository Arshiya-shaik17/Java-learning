//Super is the key word used for the accessing the values or methods from the parent class.
//We can pass values for the constructor using this super keyword. 

/*
class First1{
    int a,b;
    First1(int x,int y){
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }

}

class Second1 extends First1{

    Second1() {
        super(10,20);
        System.out.println("Second class constructor");
    }
    
}

public class SuperKeyword {
    public static void main(String[] args) {
        Second1 ob=new Second1();
        ob.sum();

    }
}
*/
/* 

class First1{
    int a,b;
    First1(int x,int y){
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }

}
class Second1 extends First1{
    int a=15;
    Second1() {
        super(10,20);
        System.out.println("Second class constructor");
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
    
}

public class SuperKeyword {
    public static void main(String[] args) {
        Second1 ob=new Second1();
        ob.sum();
        ob.display();

    }
}
*/

class First1{
    int a,b;
    First1(int x,int y){
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(a-b);
    }

}

class Second1 extends First1{

    Second1() {
        super(100,150);
        super.sum();
        super.sub();
    }
    
}

public class SuperKeyword {
    public static void main(String[] args) {
        Second1 ob=new Second1();
        

    }
}
