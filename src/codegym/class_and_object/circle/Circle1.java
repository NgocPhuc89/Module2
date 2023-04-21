package codegym.class_and_object.circle;

public class Circle1 {
    public double radius = 1 ;
    public   String color = "red";
    public Circle1(){}
    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle1(double r){}
    public double getArea(){return radius * radius * Math.PI ;}
    public double getRadius() {return radius;}
    public String getColor() {return color;}
}
