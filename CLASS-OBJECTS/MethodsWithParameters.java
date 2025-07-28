class Student{
    String name;
    int rollno;
    double marks;
    void display(String n,int r,double m){
        System.out.println("name:"+n);
        System.out.println("rollno:"+r);
        System.out.println("marks:"+m);
    }
}
class Student1{
    String name="shaik";
    int rollno=12;
    double marks=30;
    void display(String n,int r,double m){
        System.out.println("name:"+n);
        System.out.println("rollno:"+r);
        System.out.println("marks:"+m);
    }
}
public class MethodsWithParameters {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.display("Arshi", 98, 56);   //passing values in method calling.
        Student1 obj1=new Student1();
        obj.display(obj1.name,obj1.rollno,obj1.marks); 
    } 


}
