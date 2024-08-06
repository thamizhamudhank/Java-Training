package New_17.Multi_level;

public class Application extends Mobile{
    float app_version;
    String app_name;

    Application(float app_version, String app_name,String brand,double price) {
        super(brand,price);
        this.app_version=app_version;
        this.app_name=app_name;


    }
}