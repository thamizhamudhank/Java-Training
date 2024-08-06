package New_19;

    class Circle extends Shape{
        float rad;
        Circle(float rad){
            this.rad=rad;
        }
        @Override
        public void area(){
            System.out.println("Area of circle :"+(3.14f*(rad*rad)));
        }
}
