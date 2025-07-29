class Library{
    void genre(){
        System.out.println("Library has many books with many genres");
    }
}
class Horror extends Library{
    @Override
    void genre(){
        System.out.println("HORROR BOOKS");
    }
}
class Comedy extends Library{
    @Override
    void genre(){
        System.out.println("COMEDY BOOKS");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Library lib ;
        lib=new Horror();
        lib.genre();
        lib=new Comedy();
        lib.genre();
    }
}
