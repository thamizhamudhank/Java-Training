package New_9;

public class String_4 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = " ";
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        String ans = s + s1;
        for (int i = 0; i < ch.length; i++) {
            s1 = s1 + ch[i];
        }
        System.out.println(s1);
    }
}
