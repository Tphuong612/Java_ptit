/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;


class TuyenGiaoVien implements Comparable<TuyenGiaoVien>{
    private String maxt, ten, madd;
    private char m;
    private char kv;
    private double tin, cm;
    private static int dem = 0;

    public TuyenGiaoVien(String ten, String maxt, double tin, double cm) {
        this.maxt = maxt;
        this.ten = ten;
        this.tin = tin;
        this.cm = cm;
        this.madd = String.format("GV%02d", ++dem);
        this.kv = maxt.charAt(1);
        this.m = maxt.charAt(0);
    }
    public double UuTien(){
        if(kv == '1') return 2.0;
        else if(kv=='2') return 1.5;
        else if(kv=='3') return 1.0;
        return 0;
    }
    public String Mon(){
        if(m == 'A') return "TOAN";
        else if(m == 'B') return "LY";
        return "HOA";
    }
    public double Tong(){
        return tin*2 + cm + UuTien();
    }
    public String Loai(){
        if(Tong() >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }
    @Override
    public String toString(){
        return madd+" "+ten+" "+Mon()+" "+String.format("%.1f", Tong())+" "+Loai();
    }
    @Override
    public int compareTo(TuyenGiaoVien o){
        return -Double.compare(Tong(), o.Tong());
    }
}
public class J05014_TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TuyenGiaoVien a[] = new TuyenGiaoVien[n];
        for(int i=0; i<n; i++){
            a[i] = new TuyenGiaoVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(TuyenGiaoVien i: a){
            System.out.println(i);
        }
    }   
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
*/