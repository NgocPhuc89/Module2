package codegym.array;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] array = {8, 4, -9, 4, 5, 3, -2, -5};
        int min , p ;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if ( array[j] < array[min] ){
                    min = j;
                }
            }
            if ( min != i) {
                p = array[min];
                array[min] = array[i];
                array[i] = p;
            }
        }
        System.out.print(Arrays.toString(array));
    }
//    public static int [] selectsort (int [] array ){
//
//    }
}
