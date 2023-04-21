package codegym.class_and_object.quadratic_equation;

public class QuadraticEquation {
    double a, b, c ;
    public QuadraticEquation(){

    }
    public QuadraticEquation (double a , double b , double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    public double calculateDelta(){
        return  (this.b * this.b) - 4 * this.a * this.c ;
    }

    public String toString() {
        String str = "";
        if (this.calculateDelta() == 0){
            str = "Phương trình có nghiệm kép x1 = x2 = " + this.getRoot2() ;
        }
        else if (this.calculateDelta() > 0) {
            str = "Phương trính có 2 nghiệm x1 =" + this.getRoot1() +     "x2 =" + this.getRoot2();
        }
        else
            str = "Phương trình vô nghiệm";
        return  str ;
    }

    public double getRoot1 (){
       return   (- this.b + Math.sqrt (calculateDelta()) ) / (2 * this.a) ;
    }
    public  double getRoot2 (){
        return    (- this.b - Math.sqrt (calculateDelta()) ) / (2 * this.a) ;
    }

}
