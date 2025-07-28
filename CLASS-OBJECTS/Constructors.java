//same class name and constructor name
//no need to call bcoz it is run by compiler JVM
//constructor executes first than method
//just class name is enough
//constructor runs first.
//Reason to write constructor is TO INITIALIZE VARIABLES.
//Two types 1.default--no parameters  2.Parameterized(copy) 
//   JVM creates default constructor if doesnt create any constructor.
//we can pass values(parameters) to the constructors during the object creation bcoz we dont call constructor
class constructor1{
    String name;
    int rollno;
    double marks;
    void display(){
         System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);
    }
     constructor1(){
        name="Arshiya";
        marks=70;
        rollno=1;
        System.out.println("hi");
    }
   
}
public class Constructors {
    public static void main(String[] args) {
        constructor1 ob=new constructor1();
        ob.name="SHAIK";        //if we dont give any variable here then constructor runs and results the default values provided in the constructor.
        ob.display();
    }
}

