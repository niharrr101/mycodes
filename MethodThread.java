class Threat extends Thread{
    public Threat(String name){
        super(name);
    }
    @Override
    public void run(){
        synchronized(this){
            for (int i = 1; i <=10; i++) {

           System.out.println(Thread.currentThread().getName() + " -> " + i + " priority: " + Thread.currentThread().getPriority());
        }
        }

    }
}

public class MethodThread {
    public static void main(String[] args) throws InterruptedException{
        Threat t1 = new Threat("r");
        Threat t2 = new Threat("s");
        Threat t3 = new Threat("t");

        t1.setPriority(1);

        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t1.join();
        Thread.sleep(1000);
        t2.start();
        t2.join();
        Thread.sleep(1000);
        t3.start();
        



    }
    
}
