package New_12;

public class NonStaticInitializers {
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        NonStaticInitializers n1=new NonStaticInitializers();
    }
    public void demo()
    {
        System.out.println("Hello Everone");
    }
}