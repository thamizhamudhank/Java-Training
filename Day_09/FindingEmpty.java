package New_9;

public class FindingEmpty {
    public static void main(String[] args) {
        String s="Good Morning All ";
        int count=1;
        char[] ch=s.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]==' ' && ch[i+1]!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
