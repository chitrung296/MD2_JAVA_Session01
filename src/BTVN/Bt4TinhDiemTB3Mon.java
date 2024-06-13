package BTVN;

import java.util.Scanner;

public class Bt4TinhDiemTB3Mon {
    public static void main(String[] args) {
        //khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        //Nhập điểm từng môn
        System.out.println("Nhập điểm môn Toán:");
        double toan = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm môn Văn:");
        double van = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm môn Anh:");
        double anh = Double.parseDouble(scanner.nextLine());
        // tính điểm trung bình
        double avg = (toan+van+anh)/3;
        //in ra
        System.out.printf("Điểm toán %.2f \t Điểm văn %.2f \t Điểm Anh %.2f\nVậy điểm TB 3 môn là: %.2f",toan,van,anh,avg);



    }
}
