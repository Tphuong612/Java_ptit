
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int sl;
    public DoanhNghiep(String ma, String ten, int sl){
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
    @Override
    public String toString(){
        return ma +" "+ten+" "+sl;
    }
    @Override
    public int compareTo(DoanhNghiep a){
        if(sl == a.sl) return ma.compareTo(a.ma);
        return -Integer.compare(sl,a.sl);
    }
}
public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        DoanhNghiep a[] = new DoanhNghiep[n];
        for(int i=0; i<n; i++){
            a[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(DoanhNghiep i: a){
            System.out.println(i);
        }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/