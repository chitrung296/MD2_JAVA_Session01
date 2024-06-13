package RA;

public class OutputDemo {
    public static void main(String[] args) {
        //1. In chuỗi và xuống dòng
        System.out.println("Rikkei Academy chào đón các bạn");
        //2. In chuỗi và không xuống dòng (con trỏ nằm ở cuối dòng)
        System.out.print("Chúc các bạn thành công");
        //3. System.out.printf("Control String", value1, value2...)
        String studentName = "Chí Trung";
        int age = 18;
        float md1Mark = 4.9f;
        //-- In ra thông tin sinh viên với 1 câu lệnh
        //\n: xuống dòng
        //\t: lùi vào 1 tab
        System.out.printf("\nSinh viên %s với tuổi %d\tcó điểm module 1 là: %.1f\n", studentName, age, md1Mark);
        //4. System.err.println("String"): In nội dung lỗi
        System.err.println("Đã có lỗi xảy ra trong chương trình");

    }
}
