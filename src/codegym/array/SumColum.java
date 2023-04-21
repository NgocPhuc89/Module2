package codegym.array;

import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int [][] array = {  {1, 2, 3, 4, 5},
                            {5, 6, 7, 8, 9},
                            {1, 3, 5, 7, 9},
                            {2, 4, 6, 8, 0}};
        int x , sum = 0 , sum1 = 0 ;
        System.out.print(" Nhập cột muốn tính tổng : ");
        x = number.nextInt();
        for (int i = 0; i < array.length; i++) {
            sum += array[i][x];
            sum1 += array[i][i];
        }
        System.out.println(" Tổng cột " + x + " = " + sum);
        System.out.println(" Tổng đường chéo  = " + sum1);
    }
}
