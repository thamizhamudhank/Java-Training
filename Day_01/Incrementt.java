package New_1;

public class Incrementt {
    public static void main(String[] args) {
        int a = 23;
        int b = 66;
        int c = a++ - b++ + ++b - ++b + a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
