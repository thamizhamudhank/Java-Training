package New_19;

abstract public class Bank {
    int balance ;
    Bank(int balance){

        this.balance=balance;
    }
    abstract void withdraw(int amount);

    abstract void deposit(int amount);


}
