class Student{
    private String name;
    private int r_no;
    public void setName(String n,int r){
        name=n;
        r_no=r;
    }
    public String getName(){
        return name;
    }
    public int getRno(){
        return r_no;   
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("ARSHIYA",98);
        System.out.println(s.getName());
        System.out.println(s.getRno());
    }    
}
