
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class XepLoai implements Comparable<XepLoai>{
    private String name, ma, loai;
    private int lt, th, thi;
    private double tong;
    private static int dem = 1;
    public XepLoai(String name, int lt, int th, int thi){
        this.ma = String.format("SV%02d", dem++);
        this.name = convert(name);
        this.th = th;
        this.lt = lt;
        this.thi = thi;
        this.tong = 0.25*lt + 0.35*th + 0.4*thi;
        this.loai = solve();
    }
    public final String convert(String ten){
        String word[] = ten.trim().toLowerCase().split(" +");
        String kq = "";
        for (int i=0; i<word.length; i++) {
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1){
                kq += " ";
            }
        }
        return kq;
    }
    public final String solve(){
        if(tong>=8) return "GIOI";
        else if(tong>=6.5 && tong<8) return "KHA";
        else if(tong>=5 && tong<6.5) return "TRUNG BINH";
        else return "KEM";
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + String.format("%.2f", tong) + " " + loai;
    }
    @Override
    public int compareTo(XepLoai o){
        if(tong > o.tong) return -1;
        else if (tong < o.tong) return 1;
        else return 0;
    }
    
}
public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XepLoai> arl = new ArrayList<>();
        while(n-- >0){
            XepLoai a = new XepLoai(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arl.add(a);
        }
        Collections.sort(arl);
        for(XepLoai i: arl){
            System.out.println(i);
        }
    }
}
