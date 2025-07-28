class Two {
    
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
}

public class Main{
    public static void main(String[] args) {
        Two s1=new Two();
        s1.name="Arshiya";
        s1.rollno=123;
        s1.marks=60;
        s1.display(); 
    }
}


