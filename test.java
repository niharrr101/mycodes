public class test {
    public static void main(String[] args) {
         World x = new World();
         Thread t1 = new Thread(x);
        t1.start();
        for(int i= 0 ;i<10000;i++){
            System.out.println("hello");
        }
       
    }
}
