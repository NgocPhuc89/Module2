package codegym.class_and_object.shape;

public class Circle extends Shape {
    protected double radius ;
    protected Circle (double radius, String color , boolean filled ){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getArea (){
        return "diện tích hình tròn :" + radius * radius * Math.PI  ;
    }
    public double getPerimeter (){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius + "   which is a subclass of Shape";
    }
}
