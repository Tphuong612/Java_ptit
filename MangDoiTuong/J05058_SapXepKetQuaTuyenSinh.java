/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TuyenSinh1 implements Comparable<TuyenSinh1>{
    private String ma, ten;
    private double toan, ly, hoa;
    public TuyenSinh1(String ma, String ten, double toan, double ly, double hoa){
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
        return ma+" "+ten+" "+ChuanHoa(UuTien())+" "+ChuanHoa(Diem())+" "+TrangThai();
    }
    @Override
    public int compareTo(TuyenSinh1 o){
        if(Diem() == o.Diem()) return ma.compareTo(o.ma);
        return -Double.compare(Diem(), o.Diem());
    }
}
public class J05058_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TuyenSinh1 a[] = new TuyenSinh1[n];
        for(int i=0; i<n; i++){
            a[i] = new TuyenSinh1(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(a);
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

