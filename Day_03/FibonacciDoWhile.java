package New_3;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print("First " + n + " terms: ");
        int i = 1;
        do {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        } while (i <=n);


    }
}
