/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class CLB2{
    private String maCLB, tenCLB;
    private int GiaVe;

    public CLB2(String maCLB, String tenCLB, int GiaVe) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.GiaVe = GiaVe;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public int getGiaVe() {
        return GiaVe;
    }
    
}

class TranDau2 implements Comparable<TranDau2>{
    private String maTran, maCLB, tenCLB;
    private int SoLuong, DoanhThu;

    public TranDau2(String maTran, int SoLuong) {
        this.maTran = maTran;
        this.SoLuong = SoLuong;
        this.maCLB = maTran.substring(1,3);
    }

    public String getMaCLB() {
        return maCLB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }

    public void setDoanhThu(int DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    @Override
    public String toString(){
        return maTran +" "+ tenCLB +" "+ this.DoanhThu;
    }
    @Override
    public int compareTo(TranDau2 o){
        if(DoanhThu != o.DoanhThu) return -Integer.compare(DoanhThu, o.DoanhThu);
        return tenCLB.compareTo(o.tenCLB);
    }
}
public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        CLB2 a[] = new CLB2[n];
        for(int i = 0; i<n; i++){
            a[i] = new CLB2(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        int m = Integer.parseInt(sc.nextLine());
        TranDau2 b[] = new TranDau2[m];
        for(int i=0; i<m; i++){
            b[i] = new TranDau2(sc.next(), sc.nextInt());
            sc.nextLine();
        }
        for(int i=0; i<m; i++){
            for(CLB2 j: a){
                if(b[i].getMaCLB().equals(j.getMaCLB())){
                    b[i].setTenCLB(j.getTenCLB());
                    b[i].setDoanhThu(b[i].getSoLuong()*j.getGiaVe());
                }
            }
        }
        Arrays.sort(b);
        for(TranDau2 i: b){
            System.out.println(i);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/