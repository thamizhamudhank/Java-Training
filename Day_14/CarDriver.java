package New_14;

public class CarDriver {
    public static void main(String[] args) {
        Car c = new Car();
        for (int i = 0; i < c.getT().length; i++) {
            System.out.println(c.getT()[i].getBrand());
        }
    }
}