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

class ThiSinh implements Comparable<ThiSinh>{
    private String id, name, kv;
    private double toan, ly, hoa, uuTien, diemChuan, diem;
    public static int dem = 0;
    public String convert(String ten){
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
    public ThiSinh(String id, String name, double toan, double ly, double hoa){
        this.id = id;
        this.kv = id.substring(0, 3);
        this.name = convert(name);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(kv.equals("KV1")) this.uuTien = 0.5;
        else if(kv.equals("KV2")) this.uuTien = 1;
        else if(kv.equals("KV3")) this.uuTien = 2.5;
        this.diem = this.toan*2 + this.hoa + this.ly + this.uuTien;
    }
    public double diem(){
        return this.diem;
    }
    public String chuan(double a){
        if(a == (int) a) return String.format("%d",(int)a);
        else return String.format("%.1f", a);
    }
    @Override
    public String toString(){
        return id +" "+ name + " " + chuan(uuTien) + " "+chuan(diem);
    }
    @Override
    public int compareTo(ThiSinh o){
        if(this.diem == o.diem) return id.compareTo(o.id);
        return this.diem < o.diem ? 1 : -1;
    }
    
}
public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        
        while(n-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            ThiSinh a = new ThiSinh(id, name, toan, ly, hoa);
            arr.add(a);       
        }
        int t = Integer.parseInt(sc.nextLine());
        Collections.sort(arr);
        double mark = arr.get(t-1).diem();
        System.out.println(String.format("%.1f", mark));
        for(ThiSinh i: arr){
            if(i.diem() >= mark){
                System.out.println(i + " TRUNG TUYEN");
            }
            else System.out.println(i + " TRUOT");
        }
        
    }
}
