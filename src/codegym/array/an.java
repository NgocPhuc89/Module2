package codegym.array;

public class an {
    public static void main(String[] args) {
        int[] array = {2,5,3,7,9,5,9,8,9,3};
        int max=array[0];
        int max1 = array[0];
        for (int i = 1; i < array.length;i++){

            if(array[i] > max){
                max1 = max;
                max = array[i];
            }
            else if (array[i] > max1 && array[i] < max)
                max1 = array[i];
        }
        System.out.println(max1);
    }
}
