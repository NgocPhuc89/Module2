package codegym.class_and_object.demo;

public class TestDemo {
    public static void main(String[] args) {
        Demo demo = new Demo("Phuc");
        System.out.println(demo);
        Demo1 demo1 = new Demo1("aaa", 60 , 175);
        System.out.println(demo1);
        System.out.println(demo1.getWidth());
        System.out.println(demo1.getHeight());
    }
}
