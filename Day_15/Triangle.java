package New_15;

public class Triangle {
    int length;
    int breadth;
    Triangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void answer(){
        double ans= 0.5*length*breadth;
        System.out.println("Area of Triangle is: "+ans);
    }
}
