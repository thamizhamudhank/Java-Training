package New_19;

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle :" + (length * breadth));

    }
}