package CodeGym.ThucHanh;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhập n :");
        int n;
        int socuoi = 0 , sodaonguoc = 0 ;
        n = number.nextInt();
        while (n > 0){
           socuoi = n % 10 ;
           sodaonguoc = sodaonguoc * 10 + socuoi;
           n = n / 10;
        }
        System.out.println(sodaonguoc);
    }
}
