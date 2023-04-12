package CodeGym.Array;

public class MinValue {
    public static void main(String[] args) {
        int [] array = {8, 10, 3, 4, 5};
        int minValue = Min (array);
        System.out.println("Giá trị nhỏ nhất trong mảng : " + minValue);
    }
    public static int Min (int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min )
                min = array[i];
        }
        return min ;
    }
}

