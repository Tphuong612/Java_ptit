/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class ChuanHoaSinhVien{
    private String ma, ten, dob, lop;
    private float gpa;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
        public String chuanHoa(String s){
        String word[] = s.trim().split(" +");
        String kq =" ";
        for(String i: word){
            kq += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return kq.trim();
    }
    public ChuanHoaSinhVien(String ten, String lop, String ng, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", ++dem);
        this.ten = chuanHoa(ten);
        Date d = sdf.parse(ng);
        this.dob = sdf.format(d);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+dob+" "+String.format("%.2f", gpa);
    }
}
public class J07018_ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ChuanHoaSinhVien> arr = new ArrayList<>();
        for(int i=0; i<n; i++){

            ChuanHoaSinhVien a = new ChuanHoaSinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            arr.add(a);
        }
        for(ChuanHoaSinhVien i: arr){
            System.out.println(i);
        }
    }
}
