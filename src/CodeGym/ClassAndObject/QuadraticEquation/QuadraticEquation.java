package CodeGym.ClassAndObject.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c , delta , x1 , x2;
    public QuadraticEquation(){

    }
    public QuadraticEquation (double a , double b , double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    public void calculateDelta(){
        delta = (this.b * this.b) - 4 * this.a * this.c ;
    }
    public String getRoot (){
        calculateDelta();
        if (delta == 0){
          return  "Phương trình có nghiệm kép x1 = x2 =" + getRoot2()  ;
        }
        else if (delta > 0) {
            return "Phương trính có 2 nghiệm x1 =" + getRoot1() +     "x2 =" + getRoot2();
        }
        else
            return "Phương trình vô nghiệm";
    }
    public double getRoot1 (){
       return   x1 = (- this.b + Math.sqrt (delta) ) / (2 * this.a) ;
    }
    public  double getRoot2 (){
        return   x2 = (- this.b - Math.sqrt (delta) ) / (2 * this.a) ;
    }

}
