class constructor1{
    String name;
    int rollno;
    double marks;
    constructors1(String n,int r,double m){
        name=n;
        rollno=r;
        marks=m;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);
    }
}
public class ParameterizedConstructors {
    public static void main(String[] args) {
       constructor1 obj=new constructor1("a",1,40);
    obj.display(); 
    }
    

}

