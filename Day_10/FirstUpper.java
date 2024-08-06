package New_10;

public class FirstUpper {
    public static void main(String[] args) {
        String  str="yuge uehu uheu";
        String str1="";
        String s2=str+str1;
        for (int i = 1; i <s2.length(); i++) {
            if(s2.charAt(i)!=' ' && s2.charAt(i-1)==' '){
                System.out.println(str.charAt(i)-32);
            }
        }
    }
}
