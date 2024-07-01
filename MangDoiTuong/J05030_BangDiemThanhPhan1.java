
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class Diem implements Comparable<Diem>{
    private String ma, ten, lop;
    private double mon1, mon2, mon3;
    public Diem(String ma, String ten, String lop, double mon1, double mon2, double mon3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+String.format("%.1f %.1f %.1f", mon1, mon2, mon3);
    }
    @Override
    public int compareTo(Diem a){
        return ma.compareTo(a.ma);
    }
           
}
public class J05030_BangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Diem a[] = new Diem[n];
        for(int i=0; i<n; i++){
            a[i] = new Diem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println((i+1) + " " + a[i]);
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
*/
