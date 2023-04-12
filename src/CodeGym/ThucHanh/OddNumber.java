package CodeGym.ThucHanh;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i , n ;
        System.out.print("Nhập n :");
        n = Integer.parseInt(scanner.nextLine());
//        n = scanner.nextInt();
        for ( i = 0 ; i <= n ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
