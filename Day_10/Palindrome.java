package New_10;

public class Palindrome {
    public static void main(String[] args) {
String s = "madam";
        char[] ch=s.toCharArray();
        String rev ="";
        for (int i=ch.length-1;i>=0;i--) {
            rev=rev+ ch[i];
        }
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    }