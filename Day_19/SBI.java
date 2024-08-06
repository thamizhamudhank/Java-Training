package New_19;

class SBI extends Bank{
    SBI(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int amount) {
        if(amount%500==0) {
            balance = balance - amount;
            System.out.println("the balance is :" + balance);
        }
        else{
            System.out.println("please enter the amount in multiple of 500");
        }
    }

    @Override
    void deposit(int amount) {
        balance=balance+amount;
        System.out.println("the balance is :"+balance);
    }
}