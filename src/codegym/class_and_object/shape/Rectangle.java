package codegym.class_and_object.shape;

public class Rectangle extends Shape {
    protected double width , length ;
    protected Rectangle ( double width , double length){

        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String getArea (){
        return "diện tích hình chữ nhật :" + width * length ;
    }
    public  String getPerimeter (){
        return "chu vi hình chữ nhật :" + ((width + length )* 2);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + width + " and length= " + length + "  which is a subclass of Shape";
    }
}
