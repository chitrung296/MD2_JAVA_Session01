package BTVN;

import java.util.Scanner;

public class Bt1HienThiLoiChao {
    public static void main(String[] args) {
        // Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        // Nhập tên
        System.out.println("Nhập Họ và Tên:");
        String name = scanner.nextLine();
        // In ra lời chào + name
        System.out.println("Hello" + name);


    }
}
