package RA;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /**
         * 1. Khai báo và khởi tạo đối tượng Scanner(java.util.Scanner)
         * 2. Thông báo nhập dữ liệu (sử dụng các câu lệnh output)
         * 3. Lấy dữ liệu nhập từ bàn phím (các phương thức của Scanner:nextLine(),NextInt()...) và lưu vào biến
         */
        //1. Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập
        System.out.println("Nhập vào mã sinh viên:");
        //3. Lấy dữ liệu nhập từ bàn phím và lưu vào biến
        String studentId = scanner.nextLine();
        // Nhập tên sinh viên
        System.out.println("Nhập tên sinh viên:");
        String studentName = scanner.nextLine();
        // Nhập vào tuổi sinh viên
        System.out.println("Nhập tuổi sinh viên:");
        int age = scanner.nextInt();
        //C1: Xóa enter
        scanner.nextLine();
        //C2: Coi như lấy dữ liệu vào là chuỗi rồi chuyển sang kiểu dữ liệu mong muốn
        /*
         * String --> int: Integer.parseInt("String")
         * String --> float: Float.parseFloat("String")
         * String --> double: Double.parseDouble("String")
         * String --> Boolean: Boolean.parseBoolean("String")
        */
        // Nhập vào địa chỉ sinh viên
        System.out.println("Nhập địa chỉ SV:");
        String address = scanner.nextLine();
        // Nhập vào điểm sinh viên
        System.out.println("Nhập điểm TB:");
        float avgMark = Float.parseFloat(scanner.nextLine());

        //Thông tin sinh viên
        System.out.println("Mã sinh viên:" + studentId);
        System.out.println("Tên sinh viên:" + studentName);
        System.out.println("Tuổi sinh viên:" + age);
        System.out.println("Địa chỉ sinh viên:" + address);
        System.out.println("Điểm TB:" + avgMark);

    }
}
