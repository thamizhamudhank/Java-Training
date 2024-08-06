package New_22;

import java.util.ArrayList;

public class CarDriver extends Car {
    public CarDriver(String name,String color, int model, double price) {
        super(name,color, model, price);
    }

    public static void main(String[] args) {
        ArrayList<Car> a=new ArrayList<Car>();
        a.add(new Car("BMW","Red",2021,120000));
        a.add(new Car("Audi","Red",1990,1000000));
        a.add(new Car("Buccadi","Blue",2022,200000));
        a.add(new Car("Astron Martin","Black",2020,300000));
        System.out.println("Displaying car details whose color is black ");
        for (int i = 0; i <a.size(); i++) {
            Car c=a.get(i);
            if(c.color.equalsIgnoreCase("Black")){
                c.display();
            }

        }
        System.out.println("Displaying only car details whose model is inbetween 2020 to 2022");
        for (int i = 0; i < a.size(); i++) {
            Car c=a.get(i);
            if(c.Model>=2020 && c.Model<=2022){
                c.display();
            }

        }
        System.out.println("Displaying car details whose price is between 1 to 4 lakhs:");
        for (int i = 0; i <a.size(); i++) {
            Car c=a.get(i);
            if(c.price>=100000 && c.price<=400000){
                c.display();
            }

        }

    }
}
