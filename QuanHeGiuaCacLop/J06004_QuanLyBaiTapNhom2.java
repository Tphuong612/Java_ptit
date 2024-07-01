
package QuanHeGiuaCacLop;

import java.util.Arrays;
import java.util.Scanner;
class SinhVien_BTN2 implements Comparable<SinhVien_BTN2>{
    private String ma, ten, sdt, nhom, tennhom;

    public SinhVien_BTN2(String ma, String ten, String sdt, String nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getNhom() {
        return nhom;
    }

    public void setTennhom(String tennhom) {
        this.tennhom = tennhom;
    }
    
    @Override
    public String toString(){
        return ma +" "+ ten +" "+ sdt +" "+nhom+" "+tennhom;
    } 
    
    @Override
    public int compareTo(SinhVien_BTN2 o){
        return ma.compareTo(o.ma);
    }
}
class Nhom_BTN2{
    private String ma, tenbt;
    private static int dem = 0;
    public Nhom_BTN2(String tenbt) {
        this.tenbt = tenbt;
        this.ma = String.valueOf(++dem);
    }

    public String getMa() {
        return ma;
    }
    
    public String getTenbt() {
        return tenbt;
    }
    
}
public class J06004_QuanLyBaiTapNhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        SinhVien_BTN2 a[] = new SinhVien_BTN2[n];
        for(int i=0; i<n; i++){
            a[i] = new SinhVien_BTN2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            
        }
        Nhom_BTN2 b[] = new Nhom_BTN2[m];
        for(int i = 0; i<m; i++){
            b[i] = new Nhom_BTN2(sc.nextLine());
        }
       
        for(int i=0; i<n; i++){
            for(Nhom_BTN2 j: b){
                if(a[i].getNhom().equals(j.getMa())){
                    a[i].setTennhom(j.getTenbt());
                }
            }
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
  
    }
                
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/
