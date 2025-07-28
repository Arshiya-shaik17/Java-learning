//METHOD OVERLOADING by number of parameters
/* 
class overload{
    String name="Arshiya";
    int rollno=12;
    double marks=55;
    void display(){
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);
    }
    void display(String name){
        System.out.println("Hello "+name);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        overload ol=new overload();
        ol.display();
        ol.display("ARSHI");
    }
}
*/

//METHOD OVERLOADING by return type

class overload{
    String name;
    int rollno;
    double marks;
    String display(String name){
       return name;
    }
    int display(int rollno){
        return rollno;
    }
} 
public class MethodOverloading {
    public static void main(String[] args) {
        overload ol=new overload();
        System.out.println(ol.display("ARSHI"));
        System.out.println(ol.display(44));
        
    }
}

