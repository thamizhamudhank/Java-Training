package New_19;

public class BankMain {
    public static void main(String[] args) {
        SBI s = new SBI(1000);
        AXIS a = new AXIS(2000);
        HDFC h = new HDFC(3000);
        s.withdraw(800);
        s.deposit(1000);
        a.withdraw(1000);


    }
}
