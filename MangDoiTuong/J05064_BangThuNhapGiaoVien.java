
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class ThuNhap{
    private String ma, ten;
    private int lcb;

    public ThuNhap(String ma, String ten, int lcb) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
    }
    public int PhuCap(){
        String check = ma.substring(0, 2);
        if(check.equals("HT")) return (int) 2000000;
        else if (check.equals("HP")) return 900000;
        else return 500000;
    }
    public int Bac(){
        return Integer.parseInt(ma.substring(ma.length()-2));
    }
    public int Tong(){
        return lcb*Bac()+PhuCap();
    }
    @Override
    public String toString(){
        return ma +" "+ten+" "+Bac()+" "+PhuCap()+" "+Tong();
    }
}
public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThuNhap a[] = new ThuNhap[n];
        ArrayList<ThuNhap> arr = new ArrayList<>();
        int dem1 = 0, dem2 = 0;
        for(int i=0; i<n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int lcb = Integer.parseInt(sc.nextLine());
            a[i] = new ThuNhap(ma, ten, lcb);
            if(ma.substring(0, 2).equals("HT")){
                dem1++;
                if(dem1<=1) arr.add(a[i]);
            }
            if(ma.substring(0, 2).equals("HP")){
                dem2++;
                if(dem2<=2) arr.add(a[i]);
            }
            if(ma.substring(0, 2).equals("GV")){
                arr.add(a[i]);
            }
        }
        for(ThuNhap i: arr){
            System.out.println(i);
        }
    }
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/
