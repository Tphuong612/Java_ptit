/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class KhachHangFile implements Comparable<KhachHangFile>{
    private String ma, ten, gt, dc;
    private Date dob;
    private static int dem = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public String convert(String name){
        String word[] = name.trim().toLowerCase().split(" +");
        String kq = "";
        for(int i=0; i<word.length; i++){
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1) kq += " ";
        }
        return kq;
    }
    public KhachHangFile(String ten, String gt, String dob, String dc) throws ParseException {
        this.ma = String.format("KH%03d", ++dem);
        this.ten = convert(ten);
        this.gt = gt;
        this.dob = sdf.parse(dob);
        this.dc = dc;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gt+" "+dc+" "+sdf.format(dob);
    }
    @Override
    public int compareTo(KhachHangFile o){
        return dob.compareTo(o.dob);
    }
    
}
public class J07025_DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        KhachHangFile a[] = new KhachHangFile[n];
        for(int i=0; i<n; i++){
            a[i] = new KhachHangFile(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(KhachHangFile i: a){
            System.out.println(i);
        }
        
    }
}
