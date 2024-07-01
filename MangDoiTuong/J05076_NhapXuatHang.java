
package MangDoiTuong;

import java.util.Scanner;

class NhapXuat{
    private String MaHang, TenHang, XepLoai;

    public NhapXuat(String MaHang, String TenHang, String XepLoai) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.XepLoai = XepLoai;
    }

    public String getMaHang() {
        return MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public double LaiSuat(){
        if(XepLoai.equals("A")) return 0.08;
        else if(XepLoai.equals("B")) return 0.05;
        return 0.02;
    }
    
}
class ThongKe{
    private String MaHang, TenHang;
    private int SLNhap, DonGia, SLXuat;
    private double Lai;
   
    public ThongKe(String MaHang, int SLNhap, int DonGia, int SLXuat) {
        this.MaHang = MaHang;
        this.SLNhap = SLNhap;
        this.DonGia = DonGia;
        this.SLXuat = SLXuat;
    }

    public String getMaHang() {
        return MaHang;
    }
    
    public void setLai(double Lai) {
        this.Lai = Lai;
    }
    
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }
    public int TongGiaTriNhap(){
        return SLNhap*DonGia;
    }
    public int TongGiaTriXuat(){
        return (int) ((1+Lai)*DonGia*SLXuat);
    }
    @Override
    public String toString(){
        return this.MaHang+" "+this.TenHang+" "+TongGiaTriNhap()+" "+TongGiaTriXuat();
    }
   
}
public class J05076_NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhapXuat a[] = new NhapXuat[n];
        for(int i=0; i<n; i++){
            a[i] = new NhapXuat(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        ThongKe b[] = new ThongKe[m];
        for(int i=0; i<m; i++){
            b[i] = new ThongKe(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for(int i=0; i<m; i++){
            for(NhapXuat j: a){
                if(b[i].getMaHang().equals(j.getMaHang())){
                    b[i].setTenHang(j.getTenHang());
                    b[i].setLai(j.LaiSuat());
                }
            }
        }
        for(ThongKe i: b){
            System.out.println(i);
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/
