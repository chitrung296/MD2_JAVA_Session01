package BTVN;

import java.util.Scanner;

public class Bt3TinhChuViVaDienTichHinhVuong {
    public static void main(String[] args) {
        //khởi tạo scanner
        Scanner scanner = new Scanner(System.in);
        //nhập độ dài cạnh hình vuông
        System.out.println("Nhập độ dài cạnh hình vuông:");
        double canh = scanner.nextDouble();
        //tính chu vi
        double chuVi = 4 * canh;
        //tính diện tích
        double dienTich = canh * canh;
        //in ra
        System.out.printf("Hình vuông có độ dài %.2f có chu vi là %.2f\n",canh,chuVi);
        System.out.printf("Hình vuông có độ dài %.2f có diện tích là %.2f",canh,dienTich);

    }
}
