package CodeGym.ClassAndObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhập height :");
        double height = number.nextDouble();
        System.out.print("Nhập width :");
        double width = number.nextDouble();
        Rectangle rectangle = new Rectangle( height , width );
        System.out.println("Chu vi hình chữ nhật :" + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật :" + rectangle.getArea());
        System.out.println("Hình chũ nhật \n" + rectangle.display());
    }
}
