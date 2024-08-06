package New_19;

public class Bank1 {
    int balance;
    Bank1(int balance){
        this.balance=balance;
}

    void withdraw() {
        balance = balance - 500;
        System.out.println("the balance is :" + balance);
    }

    void deposit() {
        balance = balance + 1000;
        System.out.println("the balance is :" + balance);
    }
}
class SBI1 extends Bank1 {
    SBI1(int balance) {
        super(balance);
    }

    @Override
    void withdraw() {
        if (500 % 500 == 0) {
            balance = balance - 500;
            System.out.println("the balance is :" + balance);
        } else {
            System.out.println("please enter the amount in multiple of 500");
        }
    }

    @Override
    void deposit() {
        balance = balance + 1000;
        System.out.println("the balance is :" + balance);
    }
}
class AXIS1 extends Bank1{
    AXIS1(int balance) {
        super(balance);

    }

}
class HDFC1 extends Bank1{
    HDFC1(int balance) {
        super(balance);
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank1 b=new SBI1(1000);
        b.withdraw();
        b.deposit();
        Bank1 b1=new AXIS1(2000);
        b1.withdraw();
        Bank1 b2=new HDFC1(3000);
        b2.withdraw();
    }
}