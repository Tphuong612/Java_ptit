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

class SanPham implements Comparable<SanPham>{
    private String id, name;
    private int gia, baoHanh;
    public SanPham(String id, String name, int gia, int baoHanh){
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }
    public String getId(){
        return id;
    }
    public int getGia(){
        return gia;
    }
    @Override
    public String toString(){
        return id + " " + name +" " + gia + " " + baoHanh;
    }
    @Override
    public int compareTo(SanPham other){
        if(this.gia == other.getGia())
            return id.compareTo(other.getId());
        return -(this.gia - other.getGia());
    }
}
public class J07048_DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in")) ;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        while(n-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int baoHanh = Integer.parseInt(sc.nextLine());
            SanPham a = new SanPham(id, name, gia, baoHanh);
            arr.add(a);
        }
        Collections.sort(arr);
        for(SanPham i: arr){
            System.out.println(i);
        }
    }
}
