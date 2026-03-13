public class ThreadStates extends Thread{

    @Override
    public void run(){
        System.out.println("running");
        for(int i  = 0; i<= 10; i++){
            System.out.println(Thread.currentThread().getName() + " " +  i);
            Thread.yield();
        }
    
       

        }

     public static void main(String[] args) throws InterruptedException{

        ThreadStates T1 = new ThreadStates();
        ThreadStates T2 = new ThreadStates();

        System.out.println(T1.getState());

        
        T1.start();
        T2.start();
        System.out.println(T1.getState());
        

        Thread.sleep(10000);
        System.out.println(T1.getState());
        
        
        T1.join();
        System.out.println(T1.getState());




     }


     }