public class Account{
    int balance = 0;

    public synchronized void withdraw(int amt){
        if(balance > amt){
           try{
            balance = balance - amt;
            System.out.println("withdrawn....." + balance);
           }
           catch(Exception e){

           }
        }
        else{
            System.out.println("garib");
        }

    }
//ystyrfutr
    public synchronized void deposite(int amt){
        balance = balance + amt;
        System.out.println("deposited" + balance);
    }               

    public int getBalance(){
        return balance;
    }
}
