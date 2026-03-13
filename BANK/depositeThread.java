public class depositeThread extends Thread{
    Account acc;
     depositeThread(Account acc){
        this.acc = acc;
    }

    @Override
    public void run(){
        
        for(int i = 0; i <= 2; i++){
            acc.deposite(i);

        }
        System.out.println(currentThread().getName());
    }  
}
