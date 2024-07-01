
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TuyenDung implements Comparable<TuyenDung>{
    private String ten, ma;
    private double th, lt;
    private static int dem =0;
    public double diem(double a){
        if(a<=10) return a;
        else return a/10.0;
    }
    public TuyenDung(String ten, double th, double lt) {
        this.ten = ten;
        this.th = diem(th);
        this.lt = diem(lt);
        this.ma = String.format("TS%02d", ++dem);
    }
    public double tb(){
        return (th + lt)*0.5;
    }
    public String loai(){
        double a = tb();
        if(a>9.5) return "XUAT SAC";
        else if(a>=8) return "DAT";
        else if(a>5) return "CAN NHAC";
        else return "TRUOT";
    }
    @Override
    public int compareTo(TuyenDung o){
        return -Double.compare(tb(), o.tb());
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f", tb()) +" "+loai();
    }
    
}
public class J05013_TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TuyenDung a[] = new TuyenDung[n];
        for(int i=0; i<n; i++){
            a[i] = new TuyenDung(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(TuyenDung i: a){
            System.out.println(i);
        }
    }
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
*/