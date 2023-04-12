package CodeGym.CaseStudy;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1 ;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("      Quản Lý Cửa Hàng   ");
            System.out.println(" 1 . Thông Tin Khách Hàng");
            System.out.println(" 2 . Quản Lý Sản Phẩm");
            System.out.println(" 3 . Quản Lý Nhân Sự");
            System.out.println(" 0 . Exit");
            System.out.print(" Enter Your Choice :");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Thông Tin Khách Hàng");
                    System.out.println(" 1 . Họ Và Tên");
                    System.out.println(" 2 . Địa Chỉ");
                    System.out.println(" 3 . Số Điện Thoại");
                    System.out.println(" 4 . Số Lần Mua Sản Phẩm");
                    System.out.println(" 0 . Exit");
                    System.out.print(" Enter Your Choice :");
                    choice = input.nextInt();
                    switch (choice) {

                    }
                case 2:
                    System.out.println(" Quản Lý Sản Phẩm");
                    System.out.println(" 1 . Thêm Sản Phẩm ");
                    System.out.println(" 2 . Sửa Sản Phẩm");
                    System.out.println(" 3 . Xóa Sản Phẩm");
                    System.out.println(" 0 . Exit");
                    System.out.print(" Enter Your Choice :");
                    choice = input.nextInt();
                    switch (choice) {

                    }
                case 3:
                    System.out.println(" Quản Lý Nhân Sự");
                    System.out.println(" 1 . Họ Và Tên");
                    System.out.println(" 2 . Địa Chỉ");
                    System.out.println(" 3 . Số Điện Thoại");
                    System.out.println(" 4 . Số Tháng Làm Việc");
                    System.out.println(" 5 . Lương");
                    System.out.println(" 0 . Exit");
                    System.out.print(" Enter Your Choice :");
                    choice = input.nextInt();
                    switch (choice) {

                    }
                case 0:
                    System.exit(0);
                default:
                    choice = -1 ;
            }
        }
    }
}
