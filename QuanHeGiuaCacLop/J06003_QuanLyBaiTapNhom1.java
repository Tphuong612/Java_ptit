/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanHeGiuaCacLop;

import java.util.Scanner;
class SinhVien_BTN{
    private String ma, ten, sdt, nhom;

    public SinhVien_BTN(String ma, String ten, String sdt, String nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getNhom() {
        return nhom;
    }

    @Override
    public String toString(){
        return ma +" "+ ten +" "+ sdt;
    } 
}
class Nhom_BTN{
    private String ma, tenbt;
    private static int dem = 0;
    public Nhom_BTN(String tenbt) {
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
public class J06003_QuanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        SinhVien_BTN a[] = new SinhVien_BTN[n];
        for(int i=0; i<n; i++){
            a[i] = new SinhVien_BTN(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            
        }
        Nhom_BTN b[] = new Nhom_BTN[m];
        for(int i = 0; i<m; i++){
            b[i] = new Nhom_BTN(sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String nhom = sc.nextLine();
            System.out.println("DANH SACH NHOM " + nhom +":");
            for(int i=0; i<n; i++){
                if(a[i].getNhom().equals(nhom)) System.out.println(a[i]);
            }
            String ten ="";
            for(int i=0; i<m; i++){
                if(b[i].getMa().equals(nhom)){
                    ten += b[i].getTenbt();
                    break;
                }
            }
            System.out.println("Bai tap dang ky: "+ten);
            
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
1
1
*/
