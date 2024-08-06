package New_10;

public class FirstCharUpper {
    public static void main(String[] args) {
        String s = "good morning all ";
        String a = " ";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ' ') {
//              char  ch[i + 1] = (char) (ch[i] - 32);
                System.out.println();
            }
        }
    }
}
