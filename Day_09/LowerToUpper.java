package New_9;

public class LowerToUpper {
    public static void main(String[] args) {
        String s = "Thamizh";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                System.out.print((char) (ch[i] - 32));// a--97-32--A
            }

        else
            {
                System.out.print(ch[i] );
            }
        }
    }
}
