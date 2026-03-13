package lockss;

public class BookingThread extends Thread{


    TicketCount Tc;


    BookingThread(TicketCount Tc){
        this.Tc = Tc;
    }


    
    @Override 
    public void run(){
        
        Tc.bookTicket();
        System.out.println("ticket booked");
    }    
}
