package New_22;

public class Car {
    String name;
    String color;
    int Model;
    double price;
    public Car(String name,String color,int model,double price){
        this.name=name;
        this.color=color;
        this.Model=model;
        this.price=price;

    }
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Name of the car is : "+name);
        System.out.println("Color of the car is :"+color);
        System.out.println("Model of the car is :"+Model);
        System.out.println("Price of the ar is :"+price);
        System.out.println("-------------------------");
    }
}
