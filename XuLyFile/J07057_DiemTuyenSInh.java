
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh>{
    private String ma, name, tinhTrang, danToc;
    private int kv;
    private static int dem = 1;
    private float diemThi, uuTien;
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
    public ThiSinh(String name, float diemThi, String dt, int kv){
        this.ma = String.format("TS%02d", dem++);
        this.name = convert(name);
        this.danToc = dt;
        this.kv = kv;
        this.uuTien = diemUuTien1() + diemUuTien2();        
        this.diemThi = diemThi + this.uuTien;
        if(this.diemThi >= 20.5) this.tinhTrang = "Do";
        else this.tinhTrang = "Truot";  
    }
    public final float diemUuTien1(){
        if(kv == 1) return (float) 1.5;
        else if(kv == 2) return 1; 
        return 0;
    }
    public final float diemUuTien2(){
        if(!this.danToc.equals("Kinh")) return (float) 1.5;
        return 0;
    }
    @Override
    public int compareTo(ThiSinh o){
        if(diemThi == o.diemThi) return ma.compareTo(o.ma);
        if(diemThi>o.diemThi) return -1;
        else return 1;
    }
    @Override
    public String toString(){
        return ma +" "+ name +" "+ String.format("%.1f", diemThi) +" "+ tinhTrang;
    }
}
public class J07057_DiemTuyenSInh {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner sc = new Scanner(new File("THISINH.in"));
       int n = Integer.parseInt(sc.nextLine());
       ArrayList<ThiSinh> arr = new ArrayList<>();
       while(n-- >0){
           String name = sc.nextLine();
           float diem = Float.parseFloat(sc.nextLine());
           String dt = sc.nextLine();
           int kv = Integer.parseInt(sc.nextLine());
           ThiSinh a = new ThiSinh(name, diem, dt, kv);
           arr.add(a);
       }
       Collections.sort(arr);
       for(ThiSinh i: arr){
           System.out.println(i);
       }
    }  
}
