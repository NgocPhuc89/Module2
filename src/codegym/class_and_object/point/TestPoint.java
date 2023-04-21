package codegym.class_and_object.point;

import java.util.Arrays;

public class TestPoint {
    static public void main(String[] args) {
        Point2D test2D = new Point2D(3, 4);
        System.out.println(Arrays.toString(test2D.getXY()));
        Point3D test3D = new Point3D(5, 6, 7);
        System.out.println(Arrays.toString((test3D.getXYZ())));
        System.out.println(test2D);
        test2D.setX(1);
        MovablePoint test = new MovablePoint(test2D.getX(), test3D.getZ(),8 , 9);
        System.out.println(test.Move());

    }
}
