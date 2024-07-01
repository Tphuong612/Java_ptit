
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class XepHang implements Comparable<XepHang>{
    private String ten;
    private int bai, luot;
    public XepHang(String ten, int bai, int luot){
        this.ten = ten;
        this.bai = bai;
        this.luot = luot;
    }
    @Override
    public String toString(){
        return ten+" "+bai+" "+luot;
    }
    @Override
    public int compareTo(XepHang a){
        if(bai != a.bai) return -Integer.compare(bai, a.bai);
        else if(luot != a.luot) return Integer.compare(luot, a.luot);
        return ten.compareTo(a.ten);
    }
}
public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        XepHang a[] = new XepHang[n];
        for(int i=0; i<n; i++){
            a[i] = new XepHang(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }   
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/
