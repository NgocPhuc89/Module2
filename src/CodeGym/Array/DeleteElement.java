package CodeGym.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int x  ;
        int [] array = { 1, 4, 7, 4, 8, 4, 9, 6, 2};
        System.out.print("Nhập số cần xóa :");
        x = number.nextInt();

//        for (int i = 0; i < array.length; i++) {
//            if ( x == array[i]){
//                for (int j = i; j < array.length - 1 ; j++) {
//                    array[j] = array[j+1];
//                }
//                array[array.length -1] = 0 ;
//            }
//        }
        System.out.print(Arrays.toString(delete(array , x)));
    }
    public static int[] delete ( int [] arr , int n ){
        for (int i = 0; i < arr.length; i++) {
            if ( n == arr[i]){
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0 ;
            }
        }
        return arr;
    }
}
