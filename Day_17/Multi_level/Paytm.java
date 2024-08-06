package New_17.Multi_level;

public class Paytm extends Application {
    Double balance;
    Paytm(double balance ,float app_version, String app_name,String brand,double price) {
        super(app_version, app_name, brand, price);
        this.balance = balance;
    }
        public void display(){
            System.out.println("Brand: "+brand);
            System.out.println("Price :"+price);
            System.out.println("Application version :"+app_version);
            System.out.println("Application name : "+app_name);
            System.out.println("Balance : "+balance);
        }


    }
