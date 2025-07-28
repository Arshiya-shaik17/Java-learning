class overLoad{
    String name;
    int rollno;
    double marks;
    overLoad(String name){
        System.out.println("hi"+name);
    }
    overLoad(String name,int rollno){
        System.out.println("name:"+name+" "+"Rollno: "+rollno);
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        overLoad ob=new overLoad("Arshiya");
        overLoad ob1=new overLoad("SHAIK",11);
    }
}
