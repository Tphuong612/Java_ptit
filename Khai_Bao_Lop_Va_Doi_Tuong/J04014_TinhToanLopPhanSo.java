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
    public void RutGon(){
        long g = gcd(tu, mau);
        tu /= g;
        mau /= g;
    }
    public static PhanSo tong(PhanSo a, PhanSo b){
        PhanSo res = new PhanSo();
        res.mau = a.mau*b.mau;
        res.tu = a.tu*b.mau + a.mau*b.tu;
        res.RutGon();
        return res;
    }
    public static PhanSo tich(PhanSo a, PhanSo b){
        PhanSo res = new PhanSo();
        res.mau = a.mau*b.mau;
        res.tu = a.tu*b.tu;
        res.RutGon();
        return res;
    }
    @Override
    public String toString(){
        return tu + "/" + mau;
    }
    
}
public class J04014_TinhToanLopPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo res = PhanSo.tong(A,B);
            PhanSo C = PhanSo.tich(res, res);
            PhanSo D = PhanSo.tich(PhanSo.tich(A, B), C);
            System.out.println(C +" "+ D);
        }
    }
}