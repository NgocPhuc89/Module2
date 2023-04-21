package codegym.class_and_object.demo;

public class Demo1 extends Demo {
    private int width   ;
    private int height  ;
    public Demo1(String name , int width , int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public String getName(){return "Phuc";}
    public int getWidth() {
        return 60 ;
    }

    public int getHeight() {
        return 174;
    }
}
