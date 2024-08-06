package New_9;

public class String_1 {
    public static void main(String[] args) {
        String s="Hello";
        String c="WELCOME";
        String str=new String();
       char[] ch=s.toCharArray(); // char to array
       System.out.println(ch);
        System.out.println(s.length());//to find length of string
        System.out.println(s.toUpperCase());// lower to uppercase
        System.out.println(c.toLowerCase());// upper to lower
        System.out.println(s.equals(c));
        System.out.println(str);
        System.out.println(s.charAt(0));
    }
}
