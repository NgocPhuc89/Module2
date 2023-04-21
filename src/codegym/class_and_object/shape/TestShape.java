package codegym.class_and_object.shape;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(3 , "blue" , true);
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getFilled());
        System.out.println(circle.getArea()); 
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(12 , 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
