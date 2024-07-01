package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String name, lop, msv, email;
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " +lop+ " "+email;
    }
    @Override
    public int compareTo(SinhVien a){
        if(lop.equals(a.lop)) return msv.compareTo(a.msv);
        return lop.compareTo(a.lop);
    }
    
}
public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien a[] = new SinhVien[n];
        for(int i=0; i<n; i++){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            a[i] = new SinhVien(msv, ten, lop, email);
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/