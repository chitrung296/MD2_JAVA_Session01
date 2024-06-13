package BTVN;

import java.util.Scanner;

public class Bt5TinhCVDTDuongTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập bán kính r
        System.out.println("Nhập bán kính đường tròn:");
        double r = Double.parseDouble(scanner.nextLine());
        //chu vi
        float pi = 3.14f;
        double chuVi = 2*pi*r;
        //diện tích
        double dienTich = pi*r*r;
        //in ra
        System.out.printf("Với hình tròn có bán kính r là %.2f thì có chu vi %.2f và diện tích %.2f",r,chuVi,dienTich);
    }
}
