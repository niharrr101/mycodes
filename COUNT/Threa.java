package COUNT;


public class Threa extends Thread{

    Count c1;

    public Threa(Count c1){
        this.c1 = c1;

    }

    @Override

    public void run(){
        c1.minus();
        
    }
}
