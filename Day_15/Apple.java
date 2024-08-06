package New_15;

public class Apple extends Fruit {
    static int price;
    public static void main(String[] args) {
        System.out.println("using parent class name: "+Fruit.color);
        Fruit.taste();
//       System.out.println(Fruit.price);
 //       Fruit.display();
        System.out.println("Using child class name:"+Apple.color);
        Apple.taste();

        System.out.println(Apple.price);
        Apple.display();
    }
    public static void display(){
        System.out.println("From Display");

    }
}
