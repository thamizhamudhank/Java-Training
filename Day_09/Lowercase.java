package New_9;

public class Lowercase {
    public static void main(String[] args) {
        String s = "Java@1231";
        int low = 0;
        int upper = 0;
        int special = 0;
        int num = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    low++;
                } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    upper++;
                } else {
                    num++;
                }
            } else {
                special++;
            }
        }
        System.out.println(low);
        System.out.println(upper);
        System.out.println(num);
        System.out.println(special);
    }
}
