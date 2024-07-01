/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc7075{
    private String ma, ten;
    private int tc;
    public MonHoc7075(String ma, String ten, int tc) {
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
class NhomLop7075 implements Comparable<NhomLop7075>{
    private String manhom, mamon, tenmon;
    private int kip, thu;
    private String hoten, phong;
    private static int dem = 0;

    public NhomLop7075(String mamon, int thu, int kip, String hoten, String phong) {
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

    public String getHoten() {
        return hoten;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
    
    @Override
    public String toString(){
        return manhom+" "+tenmon+" "+thu+" "+kip+" "+phong;
    }
    
    @Override
    public int compareTo(NhomLop7075 o){
        if(thu != o.thu) return Integer.compare(thu, o.thu);
        else if (kip != o.kip) return Integer.compare(kip,o.kip);
        return hoten.compareTo(o.hoten);
    }
}
public class J07075_LichGiangDayTheoGiangVien {
        public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("D:\\Hoc Tap\\code\\java\\MONHOC.in.txt"));
        int n = Integer.parseInt(sc1.nextLine());
        MonHoc7075 a[] = new MonHoc7075[n];
        for(int i=0; i<n; i++){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            int tc = Integer.parseInt(sc1.nextLine());
            a[i] = new MonHoc7075(ma, ten, tc);
        }
        
        Scanner sc2 = new Scanner(new File("D:\\Hoc Tap\\code\\java\\LICHGD.in.txt"));
        int m = Integer.parseInt(sc2.nextLine());
        NhomLop7075 b[] = new NhomLop7075[m];
        for(int i=0; i<m; i++){
            String ma = sc2.nextLine();
            int thu = Integer.parseInt(sc2.nextLine());
            int kip = Integer.parseInt(sc2.nextLine());
            String ht = sc2.nextLine();
            String phong = sc2.nextLine();
            b[i] = new NhomLop7075(ma, thu, kip, ht, phong);
        }
        String gv = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+gv+":");
        ArrayList<NhomLop7075> arr = new ArrayList<>();
        
        for(NhomLop7075 i: b){
            for(MonHoc7075 j: a){
                if(i.getMamon().equals(j.getMa())){
                    i.setTenmon(j.getTen());
                }
            }
        }
        for(NhomLop7075 i: b){
            if(gv.equals(i.getHoten())){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        for(NhomLop7075 i: arr){
            System.out.println(i);
        }
        
    }
}
