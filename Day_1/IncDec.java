package New_1;

public class IncDec {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = a++ - --b + --a - ++b;
        int d = c++ - c-- - --a + ++b + --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
