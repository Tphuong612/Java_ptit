/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;
import static java.lang.Math.ceil;
import static java.lang.Math.round;
import java.util.Arrays;
import java.util.Scanner;

class BanHang implements Comparable<BanHang>{
    private String ten, dv, ma;
    private long dongia, sl;
    private static int dem = 0;
    public BanHang(String ten, String dv, int dongia, int sl){
        this.ten = ten;
        this.dv = dv;
        this.dongia = dongia;
        this.sl = sl;
        this.ma = String.format("MH%02d", ++dem);
    }
    public long PhiVanChuyen(){
        return  (long) round(dongia*sl*0.05);
    }
    public long ThanhTien(){
        return (long) round(dongia*sl + PhiVanChuyen());
    }
    public long GiaBan(){
        return (long) ceil((1.02*ThanhTien()/sl)/100.0)*100;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+dv+" "+PhiVanChuyen()+" "+ThanhTien()+" "+GiaBan();
    }
    @Override
    public int compareTo(BanHang o){
        return -Long.compare(GiaBan(), o.GiaBan());
    }
    
}
public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BanHang a[] = new BanHang[n];
        for(int i=0; i<n; i++){
            a[i] = new BanHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(BanHang i: a){
            System.out.println(i);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/
