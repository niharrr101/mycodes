package lockss;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketCount {
    public int tCount = 5;

    Lock lock = new ReentrantLock();

    public void bookTicket(){
        lock.lock();
        if(tCount > 0){
            try {
                System.out.println("booking ticket");
                tCount--;

            } catch (Exception e) {

            }
            finally{
                lock.unlock();
            }
        }
        else{
            System.out.println("come tom!");
        }
    }

    
}
