package codegym.array;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
//        int [][] array = { {1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
//        int max = 0 ;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                if ( array[i][j] > max){
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println("max : " + max);
        Scanner number = new Scanner(System.in);
        int max = 0 ;
        int n , m ;
        System.out.print("Nhập số lượng array :");
        n = number.nextInt();
        System.out.print("Nhập số phần tử array1 :");
        m = number.nextInt();
        int [][] array = new int [n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.printf("array[%d][%d] = " , i , j );
                array[i][j] = number.nextInt();
                if ( array[i][j] > max ){
                    max = array[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất trong ma trận : " + max);
    }
}
