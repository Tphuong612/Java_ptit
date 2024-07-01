/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TuyenSinh2 implements Comparable<TuyenSinh2>{
    private String ma, ten;
    private double toan, ly, hoa;
    private double diemchuan = 0;

    public void setDiemchuan(double diemchuan) {
        this.diemchuan = diemchuan;
    }
    
    public TuyenSinh2(String ma, String ten, double toan, double ly, double hoa){
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
    
    public String TrangThai(){
        if(Diem()>=diemchuan) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String ChuanHoa(double a){
        if(a == (int)a) return String.format("%d", (int)a);
        return String.format("%.1f", a);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+ChuanHoa(UuTien())+" "+ChuanHoa(Diem())+" "+TrangThai();
    }
    @Override
    public int compareTo(TuyenSinh2 o){
        if(Diem() == o.Diem()) return ma.compareTo(o.ma);
        return -Double.compare(Diem(), o.Diem());
    }
}
public class J05059_XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TuyenSinh2 a[] = new TuyenSinh2[n];
        for(int i=0; i<n; i++){
            a[i] = new TuyenSinh2(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        int chitieu = sc.nextInt();
        Arrays.sort(a);
        for(TuyenSinh2 i: a){
            double dc = a[chitieu-1].Diem();
            i.setDiemchuan(dc);
        }
        System.out.printf("%.1f\n",a[chitieu-1].Diem());
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
KV3B123
Ly Thi Thu Ha
8
6.5
7
1
*/