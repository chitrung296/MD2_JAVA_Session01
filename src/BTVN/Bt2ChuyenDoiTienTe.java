package BTVN;

import java.util.Scanner;

public class Bt2ChuyenDoiTienTe {
    public static void main(String[] args) {
        //khởi tạo scanner
        Scanner scanner = new Scanner(System.in);
        //tỷ giá
        double exchangeRate = 23500;
        //Nhập số USD muốn chuyển
        System.out.println("Nhập số tiền muốn chuyển:");
        double usd = scanner.nextDouble();
        //Tính tiền VNĐ
        double vnd = usd * exchangeRate;
        //In ra
        System.out.printf("Số tiền %.2f usd đổi ra tiền việt nam là %.2f",usd,vnd);

    }
}
