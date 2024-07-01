package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;
class PhanSo{
    private long tu, mau;
    public PhanSo(){
        tu = 1;
        mau = 1;
    }
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public PhanSo tong(PhanSo p){
        PhanSo a = new PhanSo();
        a.mau = this.mau*p.mau;
        a.tu = this.tu*p.mau + p.tu*this.mau;
        return a;
    }
    @Override
    public String toString(){
        long g = gcd(tu, mau);
        return tu/g + "/" + mau/g;
    }
}
public class J04004_TongPhanSo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo y = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo kq = x.tong(y);
        System.out.println(kq);

    }
}
