/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;

class DiemDanh2{
    private String msv, hoTen, lop;
    private int diemcc;

    public DiemDanh2(String msv, String hoTen, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
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
class SinhVienDiemDanh2{
    private String msv, diemdanh;

    public SinhVienDiemDanh2(String msv, String diemdanh) {
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
public class J05075_DiemDanh2 {
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
        DiemDanh2 a[] = new DiemDanh2[n];
        for(int i=0; i<n; i++){
            a[i] = new DiemDanh2(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        SinhVienDiemDanh2 b[] = new SinhVienDiemDanh2[n];
        for(int i=0; i<n; i++){
            String msv = sc.next();
            String cc = sc.next();
            b[i] = new SinhVienDiemDanh2(msv, cc);
        }
        for(int i=0; i<n; i++){
            for(DiemDanh2 j: a){
                if(b[i].getMsv().equals(j.getMsv())){
                    j.setDiemcc(diem(b[i].getDiemdanh()));
                }
            }
        }
        String lop = sc.next();
        for(DiemDanh2 i: a){
            if(i.getLop().equals(lop)){
                if(i.getDiemcc() == 0) System.out.println(i + " KDDK");
                else System.out.println(i);
            }
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
D19CQAT02-B
*/