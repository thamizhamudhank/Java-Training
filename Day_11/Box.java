package New_11;

import New_8.LargestElement;

public class Box {
    int length;
    int breadht;
    int area;

    Box(int length) {
        this.length = length;
    }

    Box(int length, int breadht) {
        this(length);
        this.breadht = breadht;
      //  System.out.println("length and breadth"+b1.length);
    }

    Box(int length, int breadth, int area) {
        this(length, breadth);
        this.area = area;
        System.out.println("length , breadth,area");

    }

}
class Boxes{
    public static void main(String[] args) {
//        Box.b1=new Box(10);
//        Box.b2=new Box(10,20);
//        Box.b2=new Box(10,20,30);

    }

}