package New_17.Hierararchial;

public class TVS extends Bike {
    String Brand;
    Double Price;

    TVS(String Brand, Double Price, int cc, int Model) {
        super(cc, Model);
        this.Brand = Brand;
        this.Price = Price;

    }

    public void display() {
        System.out.println("brand :" + Brand);
        System.out.println("Price :" + Price);
        System.out.println("cc: " + cc);
        System.out.println("Model :" + Model);

    }
}
