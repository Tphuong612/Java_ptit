
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class MonHoc7074{
    private String ma, ten;
    private int tc;
    public MonHoc7074(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTc() {
        return tc;
    }
    
}
class NhomLop7074 implements Comparable<NhomLop7074>{
    private String manhom, mamon;
    private int kip, thu;
    private String hoten, phong;
    private static int dem = 0;

    public NhomLop7074(String mamon, int thu, int kip, String hoten, String phong) {
        this.mamon = mamon;
        this.thu = thu;
        this.kip = kip;
        this.hoten = hoten;
        this.phong = phong;
        this.manhom = String.format("HP%03d", ++dem);
    }

    public String getMamon() {
        return mamon;
    }
    
    @Override
    public String toString(){
        return manhom+" "+thu+" "+kip+" "+ hoten+" "+phong;
    }
    
    @Override
    public int compareTo(NhomLop7074 o){
        if(thu != o.thu) return Integer.compare(thu, o.thu);
        else if (kip != o.kip) return Integer.compare(kip,o.kip);
        return hoten.compareTo(o.hoten);
    }
}
public class J07074_LichGiangDayTheoMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc1.nextLine());
        MonHoc7074 a[] = new MonHoc7074[n];
        for(int i=0; i<n; i++){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            int tc = Integer.parseInt(sc1.nextLine());
            a[i] = new MonHoc7074(ma, ten, tc);
        }
        
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc2.nextLine());
        NhomLop7074 b[] = new NhomLop7074[m];
        for(int i=0; i<m; i++){
            String ma = sc2.nextLine();
            int thu = Integer.parseInt(sc2.nextLine());
            int kip = Integer.parseInt(sc2.nextLine());
            String ht = sc2.nextLine();
            String phong = sc2.nextLine();
            b[i] = new NhomLop7074(ma, thu, kip, ht, phong);
        }
        String mon = sc2.nextLine();
        String ten = "";
        for(MonHoc7074 i: a){
            if(mon.equals(i.getMa())){
                ten = i.getTen();
                break;
            }
        }
        System.out.println("LICH GIANG DAY MON "+ten+":");
        ArrayList<NhomLop7074> arr = new ArrayList<>();
        for(NhomLop7074 i: b){
            if(mon.equals(i.getMamon())){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        for(NhomLop7074 i: arr){
            System.out.println(i);
        }
    }
}
