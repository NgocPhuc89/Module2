package CodeGym.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int x , p ;
        int [] array = { 1, 4, 7, 3, 8, 5, 9, 6, 2};
        System.out.print("Nhập số cần xóa :");
        x = number.nextInt();
        for (int i = 0; i < array.length; i++) {
            if ( x == array[i]){
                for (int j = i; j < array.length - 1 ; j++) {
                    array[j] = array[j+1];
                }
                array[array.length -1] = 0 ;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
