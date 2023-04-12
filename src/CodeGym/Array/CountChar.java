package CodeGym.Array;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str ;
        int count = 0 ;
        char p ;
        System.out.print("Nhập chuỗi :");
        str = input.nextLine();
        System.out.print("Nhập ký tự cần tìm :");
        p = input.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if ( p == str.charAt(i))
                count++ ;
        }
        System.out.printf("Ký tự %s xuất hiện " + count + " lần ", p);
    }
}
