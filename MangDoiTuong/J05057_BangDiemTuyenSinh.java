
package MangDoiTuong;

import java.util.Scanner;

class TuyenSinh{
    private String ma, ten;
    private double toan, ly, hoa;
    public TuyenSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = ten; 
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double UuTien(){
        String kv = ma.substring(0, 3);
        if(kv.equals("KV1")) return 0.5;
        else if(kv.equals("KV2")) return 1.0;
        else if(kv.equals("KV3")) return 2.5;
        return 0;
    }
    public double Diem(){
        return (toan*2 + ly + hoa) + UuTien();
    }
    public double NoUuTien(){
        return toan*2+ly+hoa;
    }
    public String TrangThai(){
        if(Diem()>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String ChuanHoa(double a){
        if(a == (int)a) return String.format("%d", (int)a);
        return String.format("%.1f", a);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+ChuanHoa(UuTien())+" "+ChuanHoa(NoUuTien())+" "+TrangThai();
    }
}
public class J05057_BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TuyenSinh a[] = new TuyenSinh[n];
        for(int i=0; i<n; i++){
            a[i] = new TuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
 
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
*/


