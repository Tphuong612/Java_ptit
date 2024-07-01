
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
    @Override
    public String toString(){
        long g = gcd(tu, mau);
        tu = tu/g;
        mau = mau/g;
        return tu + "/" + mau;
    }
}
public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p = new PhanSo(a, b);
        System.out.println(p);
    }
}
