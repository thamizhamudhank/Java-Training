package New_9;

public class String_2 {
    public static void main(String[] args) {
        String s="Welcome";
        System.out.println(s.substring(4));//print Particular string using index(beginning)
        System.out.println(s.substring(0,4));// pring pariticular string from begining  to ending
        System.out.println(s.startsWith("Wel"));// finding result present in a string using Starting letter
        System.out.println(s.endsWith("me"));//finding result present in a string using ending letter
        System.out.println(s.indexOf('W'));
    }
}
