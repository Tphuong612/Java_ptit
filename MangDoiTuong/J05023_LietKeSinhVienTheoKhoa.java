
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    private String name, lop, msv, email;
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        
    }
    public String khoa(){
       String s = lop.substring(1,3);
       return s;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " +lop+ " "+email;
    }
    
}
public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String s = sc.nextLine();
            //sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s +":");
            String k = s.substring(2);//khoa
            for(SinhVien i: arr){
                if((i.khoa()).equals(k)){    
                    //System.out.println(i.khoa());
                    System.out.println(i);
                }
            }
        }       
    }  
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
2
2015
*/