package CodeGym.Array;

public class GreatestValue {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7} ;
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i] > max)
                max = array[i];
            if ( array[i] < min)
                min = array[i];
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
