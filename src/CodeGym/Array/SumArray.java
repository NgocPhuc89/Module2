package CodeGym.Array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n , m  ;
        System.out.print("Nhập giá trị các phần tử array_1 :");
        n = number.nextInt();
        int [] array_1 = new int[n] ;
        for (int i = 0; i < n; i++) {
            System.out.printf(" array_1[%d] = " , i);
            array_1[i] = number.nextInt();
        }
        System.out.print("Nhập giá trị các phần tử array_2 :");
        m = number.nextInt();
        int [] array_2 = new int[m] ;
        for (int i = 0; i < m; i++) {
            System.out.printf( " array_2[%d] = " , i);
            array_2[i] = number.nextInt();
        }
        int p = n + m ;
        int [] array_3 = new int[p];
        for (int i = 0; i < n; i++) {
            array_3[i] = array_1[i];
//            System.out.printf(" array_3[%d] =" + array_1[i] + "\n" , i );
        }
        for (int i = 0; i < m; i++) {
            array_3[array_1.length + i] = array_2[i];
//            System.out.printf(" array_3[%d] =" + array_2[i] + "\n" , array_1.length + i);
        }
        System.out.print("Mảng array_3 gồm các phần tử: ");
        for (int arr: array_3) {
        }
        System.out.print(Arrays.toString(array_3));
    }
}
