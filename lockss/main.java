
package lockss;

public class main {
    public static void main(String[] args) {

            TicketCount tc = new TicketCount();

            BookingThread t1 = new BookingThread(tc);
            BookingThread t2 = new BookingThread(tc);
            BookingThread t3 = new BookingThread(tc);
            BookingThread t4 = new BookingThread(tc);
            BookingThread t5 = new BookingThread(tc);


            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();



    }
    
}
