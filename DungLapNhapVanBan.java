import java.util.Scanner;

public class DungLapNhapVanBan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap van ban (nhan Enter de dung): ");
            String input = scanner.nextLine();

            // Kiểm tra nếu người dùng chỉ nhấn Enter (chuỗi rỗng)
            if (input.isEmpty()) {
                break; // Dừng vòng lặp
            }

            // Xử lý dữ liệu người dùng ở đây
            System.out.println("Ban da nhap: " + input);
        }

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
*/