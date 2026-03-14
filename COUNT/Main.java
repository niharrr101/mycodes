package COUNT;

public class Main {
    public static void main(String[] args) {
        Count c = new Count();
        Threa t1 = new Threa(c);
        Threa t12= new Threa(c);
        Threa t123 = new Threa(c);
        Threa t1234 = new Threa(c);

        t1.start();
        t12.start();
        t123.start();
        t1234.start();
        
    }
}
