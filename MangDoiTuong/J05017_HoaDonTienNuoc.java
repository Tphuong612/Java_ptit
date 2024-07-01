/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TienNuoc implements Comparable<TienNuoc>{
    private String ten, ma;
    private int cu, moi;
    private static int dem = 0; 
    public TienNuoc(String ten, int cu, int moi) {
        this.ten = ten;
        this.cu = cu;
        this.moi = moi;
        this.ma = String.format("KH%02d", ++dem);
    }
    public double Tien(){
        int so = moi - cu;
        if(so > 100){
            int tra = (so-100)*200+50*150+50*100;
            return tra*1.05;
        }
        else if(so > 50){
            int tra = (so-50)*150+50*100;
            return tra*1.03;
        }
        else {
            int tra = so*100;
            return tra*1.02;
        }
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+Math.round(Tien());
    }
    //" "+gia()+" "+Tong()+" " + phu()+ " 
    @Override
    public int compareTo(TienNuoc o){
        return -Double.compare(Tien(), o.Tien());
    }
}
public class J05017_HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TienNuoc a[] = new TienNuoc[n];
        for(int i=0; i<n; i++){
            a[i] = new TienNuoc(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(TienNuoc i: a){
            System.out.println(i);
        }
    }
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/