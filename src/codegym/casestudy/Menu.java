package codegym.casestudy;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1 ;
        Scanner input = new Scanner(System.in);
        while (true){
            printMenuFirst();
            choice = MethodUtils.choice(input);
            switch (choice) {
                case 1:
                    System.out.println(" Thông Tin Khách Hàng");
                    System.out.println(" 1 . Họ Và Tên");
                    System.out.println(" 2 . Địa Chỉ");
                    System.out.println(" 3 . Số Điện Thoại");
                    System.out.println(" 4 . Ngày Thuê");
                    System.out.println(" 5 . Ngày Trả");
                    System.out.println(" 6 . Tổng Tiền");
                    System.out.println(" 0 . Exit");
                    System.out.print(" Enter Your Choice :");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 4:
                            break;

                    }
                    break;
                case 2:
                    System.out.println(" Quản Lý Xe Đạp");
                    System.out.println(" 1 . Thêm  ");
                    System.out.println(" 2 . Sửa ");
                    System.out.println(" 3 . Xóa ");
                    System.out.println(" 4 . Quay Lại");
                    System.out.println(" 0 . Exit");
                    System.out.print(" Enter Your Choice :");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 4 :
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    choice = -1 ;
            }
        }
    }
    private static void printMenuFirst(){
        InformationDetail[] informationDetails = new InformationDetail[3];
        informationDetails[0] = new InformationDetail(1, "Thông Tin Khách Hàng");
        informationDetails[1] = new InformationDetail(2, "Quản Lý Xe Đạp");
        informationDetails[2] = new InformationDetail(0, "Exit");
        Information information = new Information("Quản Lý Thuê Xe Đạp Du Lịch", informationDetails);
        MethodUtils.printMenu(information);
    }

}
