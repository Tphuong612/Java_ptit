
package XauKyTu;

import java.util.Scanner;


public class J03029_ChuanHoaCau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kq = "";
        while(sc.hasNextLine()){
            kq += sc.nextLine().toLowerCase() + " .";
            if(sc.nextLine().isEmpty()) break;
        }
        String cau[] = kq.trim().split(" .");
        for(String i: cau){
            System.out.println(i);
        }
    }
/*
Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet.     Ke theo chuan quoc te.
co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
moi    CAC BAN danG ky     thaM giA !
*/}
