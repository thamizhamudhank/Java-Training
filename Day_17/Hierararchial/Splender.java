package New_17.Hierararchial;

public class Splender extends Bike{
String Brand;
double price;
    Splender(String Brand,double price,int cc, int Model) {
        super(cc, Model);
        this.Brand=Brand;
        this.price=price;

    }
    public void display(){
        System.out.println("brand :"+Brand);
        System.out.println("Price :"+price);
        System.out.println("cc: "+ cc);
        System.out.println("Model :" +Model);


    }
}
