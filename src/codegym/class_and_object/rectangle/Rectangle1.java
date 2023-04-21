package codegym.class_and_object.rectangle;

public class Rectangle1 {
    double height , width ;
    public Rectangle1() {

    }
    public Rectangle1(double height , double width){
        this.height = height;
        this.width = width ;
    }
    public double getArea () {
        return this.height * this.width ;
    }
    public double getPerimeter () {
        return (this.height + this.width) * 2;
    }
    public String display() {
        return  "Rectangle {"+ "width =" + width +   "height =" + height + " }";
    }
}
