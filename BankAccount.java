class Acc{
    int balance = 1000;
public synchronized void withdraw(int amount){

    int currentBalance = balance;

    try {
        Thread.sleep(100);
    } catch(Exception e){}

    balance = currentBalance - amount;

    System.out.println(Thread.currentThread().getName() +
            " remaining balance = " + balance);
}
    public int getBalance(){
        return balance;
    }


}

class Customer extends Thread{
    Acc account;

    Customer(Acc account){
        this.account = account;
    }

    @Override
    public void run(){
        account.withdraw(100);
    }
     
}




public class BankAccount{
    public static void main(String[] args) {

        Acc account = new Acc();

        
        Customer c1 = new Customer(account);
       


        Customer c2 = new Customer(account);
        c2.start();
        c1.start();
    }

}