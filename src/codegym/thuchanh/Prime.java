package codegym.thuchanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n , p = 0 , count = 0 ;
        System.out.print(" Nhập n :");
        n = number.nextInt();
        for (int i = 0; i < 1000; i++) {
            if ( i < 2)
                continue;
            if (i == 2) {
                System.out.println(i);
                p++;
            }
            else {
                for (int j = 2; j < i; j++) {
                    if ( i % j == 0){
                        count++ ;
                    }
                }
                if ( count == 0 && p < n){
                    System.out.println(i);
                    p++;
                }
                count = 0;
            }
        }
    }
}
