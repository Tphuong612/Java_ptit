
package MangDoiTuong;

import java.util.Scanner;

class Luong{
    private String HoTen, ChucVu, ma;
    private int LuongNgay, NgayCong;
    private static int dem = 0;
    public Luong(String ten,int luongNgay, int ngayCong, String chuc){
        this.HoTen = ten;
        this.ChucVu = chuc;
        this.LuongNgay = luongNgay;
        this.NgayCong = ngayCong;
        this.ma = String.format("NV%02d", ++dem);
    }
    public int LuongThang(){
        return LuongNgay*NgayCong;
    }
    public int Thuong(){
        if(NgayCong >=25) return (int) LuongThang()*20/100;
        else if(NgayCong >=22 && NgayCong<25) return (int) LuongThang()*10/100;
        return 0;
    }
    public int PhuCap(){
        if(ChucVu.equals("GD")) return 250000;
        else if(ChucVu.equals("PGD")) return 200000;
        else if(ChucVu.equals("TP")) return 180000;
        else if(ChucVu.equals("NV")) return 150000;
        return 0;
    }
    public int Linh(){
        return LuongThang()+Thuong()+PhuCap();
    }
    @Override
    public String toString(){
        return ma+" "+HoTen+" "+LuongThang()+" "+Thuong()+" "+PhuCap()+" "+Linh();
    }
}
public class J05038_BangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Luong a[] = new Luong[n];
        int tong = 0;
        for(int i=0; i<n; i++){
            a[i] = new Luong(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            tong += a[i].Linh();
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        System.out.println("Tong chi phi tien luong: " + tong);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/