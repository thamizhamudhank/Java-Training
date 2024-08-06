package New_9;

public class UpperToLower {
    public static void main(String[] args) {
        String s = "hello";
        String a ="THAMIZH";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                System.out.print((char) (ch[i] - 32));
            }
        }
    }
}
