package CodeGym.Array;

public class SmallestOddValue {
    public static void main(String[] args) {
        int [] arrays = {12, 2, 9, 4, 8, 6, 7, 18};
        int max = arrays[0];
        int min = arrays[0];
        for (int i = 1; i < arrays.length; i += 2 ) {
            if ( arrays[i] < min)
                min = arrays[i];
            if ( arrays[i] > max)
                max = arrays[i];
        }
        System.out.println("min vị trí lẻ :" + min);
        System.out.println("max vị trí lẻ :" + max);
    }
}
