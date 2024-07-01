/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private int sl, ck;
    private long dg;

    public HoaDon(String ma, String ten, int sl, long dg, int ck) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
        this.ck = ck;
    }
    
    public long Tong(){
        return (long) (sl*dg - ck);
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + sl +" "+dg+" "+ck+" "+ Tong();
    }
    
    @Override
    public int compareTo(HoaDon o){
        return -Long.compare(Tong(), o.Tong());
    }
    
}
public class J05012_TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HoaDon a[] = new HoaDon[n];
        for(int i=0; i<n; i++){
            a[i] = new HoaDon(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(HoaDon i: a){
            System.out.println(i);
        }
    }
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
*/