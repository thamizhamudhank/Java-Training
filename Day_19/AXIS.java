package New_19;

class AXIS extends Bank{
    AXIS(int balance) {
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