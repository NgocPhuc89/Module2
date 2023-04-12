package CodeGym.Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int x ;
        Scanner number = new Scanner(System.in);
        System.out.print("Nhập số cần tìm : ");
        x = number.nextInt();
        System.out.printf( "Số %d ở vị trí :\n" + binarySearch(array , x) , x);
    }
    public static String binarySearch ( int [] array , int x){
        int low = 0 ;
        int hight = array.length -1 ;
        while ( hight >= low){
            int mid = (low + hight)/2 ;
            if ( x < array[mid])
                hight = mid -1 ;
            else if ( x == array[mid])
                return  "" + mid ;
            else
                low = mid + 1 ;
        }
        return  "Số " + x + " không có trong mảng " ; //hight < low
    }
}
