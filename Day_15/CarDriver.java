package New_15;
//Has A Relationship-Lazy Instantiation-one to one
public class CarDriver {
    public static void main(String[] args) {
        car c=new car();
        c.addTyre(new Tyre("Apollo"));
        System.out.println(c.t.brand);
    }
}
