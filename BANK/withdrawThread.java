public class withdrawThread extends Thread{
    Account acc;

    withdrawThread(Account acc){
        this.acc = acc;
    }

    @Override
    public void run(){
        for(int i = 0; i<= 2; i++){
            acc.withdraw(i);
        }
        System.out.println(currentThread().getName());
    }
}