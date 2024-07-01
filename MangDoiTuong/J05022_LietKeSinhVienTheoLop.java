
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class SinhVien {
    private String name, lop, msv, email;
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getLop(){
        return lop;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " +lop+ " "+email;
    }
    
}

public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien a[] = new SinhVien[n];
        for(int i=0; i<n; i++){

            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            
        }
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s +":");
            for(SinhVien i: a){
                if(i.getLop().equals(s)){
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
1
D15CQKT02-B
*/