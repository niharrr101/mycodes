package COUNT;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;



public class Count{

    public int counter = 3;
    java.util.concurrent.locks.Lock lock = new ReentrantLock(true);

    public  void minus(){
        System.out.println(Thread.currentThread().getName());
        
        try {
            if(lock.tryLock(5000, TimeUnit.MILLISECONDS)){

                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() +"in lockkkk");
                    if(counter > 0){
                        System.out.println("available = " + counter);
                        System.out.println("decreasing");
                        counter--;
                        System.out.println(counter);
                
            }
                    else{
                System.out.println("no spots");
            }
            
            } catch (Exception e) {

            }finally{
                System.out.println("Unlocekd");
                System.out.println("----------work done------------");
                lock.unlock();
                
            }

                    
                }
                else{
                    System.out.println(Thread.currentThread().getName() + "cant aquire lock");
                }
            } catch (Exception e) {
            }
        
    }
     
    public int getCounter(){
        return counter;
    }
}



