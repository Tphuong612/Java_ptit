/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;

class CLB{
    private String ma, ten;
    private int gia;
    public CLB(String ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    } 

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }
    
}
class TranDau{
    private String ma, maCLB, tenCLB;
    private int soluong, loinhuan;

    public TranDau(String ma, int soluong) {
        this.ma = ma;
        this.soluong = soluong;
        this.maCLB = ma.substring(1,3);
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setLoinhuan(int loinhuan) {
        this.loinhuan = loinhuan;
    }
    @Override
    public String toString(){
        return ma +" "+ tenCLB +" "+ loinhuan;
    }
       
   
}
public class J05069_CauLacBoBongDa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        CLB a[] = new CLB[n];
        for(int i = 0; i<n; i++){
            a[i] = new CLB(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        int m = Integer.parseInt(sc.nextLine());
        TranDau b[] = new TranDau[m];
        for(int i=0; i<m; i++){
            b[i] = new TranDau(sc.next(), sc.nextInt());
            sc.nextLine();
        }
        for(int i=0; i<m; i++){
            for(CLB j: a){
                if(b[i].getMaCLB().equals(j.getMa())){
                    b[i].setTenCLB(j.getTen());
                    b[i].setLoinhuan(b[i].getSoluong()*j.getGia());
                }
            }
        }
        for(TranDau i: b){
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