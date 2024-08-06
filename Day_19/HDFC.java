package New_19;

class HDFC extends Bank{
    HDFC(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int amount) {
        balance=balance-amount;
        System.out.println("the balance is :"+balance);
    }

    @Override
    void deposit(int amount) {
        balance=balance+amount;
        System.out.println("the balance is :"+balance);
    }
}
