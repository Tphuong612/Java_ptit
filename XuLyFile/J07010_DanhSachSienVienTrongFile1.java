/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SinhVien{
    public static int dem = 1;
    private String msv, name, dob, cl;
    private float gpa;
    
    public SinhVien(String name, String cl, String dob, float gpa) throws ParseException{
        this.msv = "B20DCCN" + String.format("%03d", dem++);
        this.name = name;
        this.cl = cl;
        this.gpa = gpa;
        
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = fm.format(fm.parse(dob));
    }
    @Override
    public String toString(){
        return msv + ' ' + name + ' ' + cl + ' ' + dob + ' ' + String.format("%.2f", gpa);
    }
}
public class J07010_DanhSachSienVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien sv = new SinhVien(name, cl, dob, gpa);
            System.out.println(sv);
        }
    }
}