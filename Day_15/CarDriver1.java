package New_15;
//Has A Relationship-Lazy Instantiation-one to Many

public class CarDriver1 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.addTyre1(new Tyre1("Apollo"));
        c.addTyre1(new Tyre1("MRF"));
        c.addTyre1(new Tyre1("CEAT"));
        c.addTyre1(new Tyre1("Hero"));

        for (int i = 0; i < c.t.length; i++) {
            System.out.println(c.t[i].brand);

        }

    }
}
