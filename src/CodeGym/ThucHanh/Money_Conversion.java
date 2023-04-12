package CodeGym.ThucHanh;

import java.util.Scanner;

public class Money_Conversion {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        int USD , VND ;
        int rate = 23000 ;
        System.out.print(" Nhập số tiền cần đổi (USD) : ");
        USD = money.nextInt();
        VND = USD * rate ;
        System.out.println( USD + "USD = " + VND + "VND");
    }

    public static class CountChar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String n  ;
            int tu = 1 , kytu = 0  ;
            System.out.print("Nhập câu bất kỳ :");
            n = scanner.nextLine();
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == ' '){
                    tu ++ ;
                }
                else {
                    kytu ++;
                }
            }
            System.out.println("Số từ :" + tu);
            System.out.println("Số ký tự :" + kytu);
        }
    }
}
