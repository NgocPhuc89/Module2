package CodeGym;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhập số n :");
        int n , count = 0;
        n = number.nextInt();
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                continue;
            }
            if (i == 2) {
                System.out.println(i);
            }
            else  {
                    for (int j = 2; j < i ; j++) {
                        if ( i % j == 0){
                           count++;
                        }
                    }
                if ( count == 0){
                    System.out.println(i);
                }
                    count = 0;

                }
            }
        }
    }

