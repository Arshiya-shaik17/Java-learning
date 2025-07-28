public class Start {
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }

    public static void main(String[] args) {
        Start s1=new Start();
        s1.name="Arshiya";
        s1.rollno=123;
        s1.marks=60;
        s1.display(); 
    }
}

    

