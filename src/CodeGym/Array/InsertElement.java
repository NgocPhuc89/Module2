package CodeGym.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int [] array = {1, 3, 5, 7, 8, 4, 0, 0, 0, 0};
        int x , n ;
        System.out.print(" Nhập số cần chèn :");
        x = number.nextInt();
        System.out.print(" Nhập vị trí cần chèn :");
        n = number.nextInt();
        for (int i = 0; i < array.length; i++) {
            if ( n == i) {
                for (int j = array.length - 1; j > i; j--) {
                     array[j] = array[j - 1];
                }
                array[i] = x ;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
