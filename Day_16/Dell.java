package New_16;

public class Dell extends Laptop{
    String name;
    int ram;
    double price;
     Dell(String name,int ram,double price,String os) {
        super(os);
        this.name=name;
        this.ram=ram;
        this.price=price;
    }

    public void display(){
        System.out.println("Name :"+name);
        System.out.println("ram :"+ram);
        System.out.println("price :"+price);
        System.out.println("OS :" +os);
         
    }
    
}
