
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;
final class NhanVien{
    private String ma, ten, chuc;
    private int luongNgay, ngay, phuCap, thuong, luongcb;
    public static int dem = 1;
    public int phu(){
        if("GD".equals(chuc)) return 250000;
        else if("PGD".equals(chuc)) return 200000;
        else if("TP".equals(chuc)) return 180000;
        else if("NV".equals(chuc)) return 150000;
        return 0;
    }
    public int khen(){
        if(ngay >= 25) return luongcb*20/100;
        else if(ngay <25 && ngay >=22) return luongcb*10/100;
        return 0;
    }
    public NhanVien(String ten, int luongNgay, int ngay, String chuc){
        this.ma = String.format("NV%02d", dem++);
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.luongcb = luongNgay*ngay;
        this.ngay = ngay;
        this.chuc = chuc;
        this.phuCap = phu();
        this.thuong = khen();
        
    }

    public int thuNhap(){
        return luongcb + thuong + phuCap;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+luongcb+" "+thuong+" "+phuCap+" "+thuNhap();
    }
}
        
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongcb = sc.nextInt();
        int ngay = sc.nextInt();
        sc.nextLine();
        String chuc = sc.nextLine();
        NhanVien a = new NhanVien(ten, luongcb, ngay, chuc);
        System.out.println(a);
    }
}
/*
Bui Thi Trang
45000
23
PGD
*/