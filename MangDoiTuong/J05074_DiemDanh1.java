/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;

class DiemDanh1{
    private String msv, hoTen, lop;
    private int diemcc;

    public DiemDanh1(String msv, String hoTen, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setDiemcc(int diemcc) {
        this.diemcc = diemcc;
    }

    public int getDiemcc() {
        return diemcc;
    }
    
    @Override
    public String toString(){
        return msv+" "+hoTen+" "+lop+" "+diemcc;
    }
    
}
class SinhVienDiemDanh{
    private String msv, diemdanh;

    public SinhVienDiemDanh(String msv, String diemdanh) {
        this.msv = msv;
        this.diemdanh = diemdanh;
    }

    public String getMsv() {
        return msv;
    }

    public String getDiemdanh() {
        return diemdanh;
    }
    
}
public class J05074_DiemDanh1 {
    public static int diem(String s){
        int diem = 10;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'v') diem -= 2;
            if(s.charAt(i) == 'm') diem -= 1;
        }
        if(diem<0) return 0;
        return diem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DiemDanh1 a[] = new DiemDanh1[n];
        for(int i=0; i<n; i++){
            a[i] = new DiemDanh1(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        SinhVienDiemDanh b[] = new SinhVienDiemDanh[n];
        for(int i=0; i<n; i++){
            String msv = sc.next();
            String cc = sc.next();
            b[i] = new SinhVienDiemDanh(msv, cc);
        }
        for(int i=0; i<n; i++){
            for(DiemDanh1 j: a){
                if(b[i].getMsv().equals(j.getMsv())){
                    j.setDiemcc(diem(b[i].getDiemdanh()));
                }
            }
        }
        for(DiemDanh1 i: a){
            if(i.getDiemcc() == 0) System.out.println(i + " KDDK");
            else System.out.println(i);
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
*/