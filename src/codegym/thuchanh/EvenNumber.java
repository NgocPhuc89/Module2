package codegym.thuchanh;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i , n ;
        System.out.print("Nhập n :");
        n = scanner.nextInt();
        for (i = 1 ; i <= n ; i++){
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
