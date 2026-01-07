package PracticaClase.src;

public class BanckAccount {

    private String accountHolder;
    private double balance;

    public BanckAccount(){

    }

    public BanckAccount(String accountHolder , double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){

        if (amount > 0) balance =+ amount;
    }

    public void withdraw(double amount){

        if(amount <= balance) balance -= amount;
    }

    public void showBalance(){
        System.out.println("Balance = " + balance);
    }
}
