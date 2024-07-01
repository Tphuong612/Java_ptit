/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class ThiSinh{
    private String ma, ten, trangThai, kv;
    private float toan, ly, hoa, uu, tong;
    public ThiSinh(String ma, String name, float toan, float ly, float hoa){
        this.ma = ma;
        this.kv = ma.substring(0, 3);
        this.ten = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.uu = uuTien();
        this.tong = toan*2 + ly + hoa;
        this.trangThai = trang();
    }
    public final float uuTien(){
        if(kv.equals("KV1")) return (float) 0.5;
        else if(kv.equals("KV2")) return (float) 1.0;
        else if(kv.equals("KV3")) return (float) 2.5; 
        return 0;
    }
    public final String trang(){
        if(tong + uu >=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public String chuan(float a){
        if(a == (int)a) return String.format("%d",(int)a);
        else return String.format("%.1f", a);
    }
    @Override
    public String toString(){
        return ma + " " + ten +" "+chuan(uu)+" "+chuan(tong)+" "+trangThai;
    }
}
public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        sc.nextLine();
        ThiSinh a = new ThiSinh(ma, ten, toan, ly, hoa);
        System.out.println(a);
    }
}
/*
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