package CodeGym.ClassAndObject.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhập a :");
        double a = number.nextDouble();
        System.out.print("Nhập b :");
        double b = number.nextDouble();
        System.out.print("Nhập c :");
        double c = number.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a , b, c);
        //System.out.println(quadraticEquation.getDelta());
        System.out.println(quadraticEquation.getRoot());
    }
}
