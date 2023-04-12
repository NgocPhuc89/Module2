package CodeGym.Array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {8, 4, -9, 4, 5, 3, -2, -5};
        int x , p ;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            p = i;
            while ( p > 0 && x < array[p - 1]){
                array[p] = array[p -1];
                p--;
            }
            array[p] = x ;
        }
        System.out.print(Arrays.toString(array));
    }
}
