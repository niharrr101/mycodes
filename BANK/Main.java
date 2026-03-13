public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account acc1 = new Account();

        depositeThread t1 = new depositeThread(acc1);
        depositeThread t2 = new depositeThread(acc1);
        depositeThread t3 = new depositeThread(acc1);

        withdrawThread w1 = new withdrawThread(acc1);
        withdrawThread w2 = new withdrawThread(acc1);
        withdrawThread w3 = new withdrawThread(acc1);

        t1.start();
        t2.start();
        t3.start();

        w1.start();
        w2.start();
        w3.start();

        // wait for threads to finish
        t1.join();
        t2.join();
        t3.join();

        w1.join();
        w2.join();
        w3.join();

        System.out.println( acc1.getBalance());
    }
}