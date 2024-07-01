
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private float gpa;
    private String dob, lop, name;
    private String msv = "B20DCCN001";
    public SinhVien(){
        this("", "", "", 0);
    }
    public SinhVien(String name, String lop, String dob, float gpa){
        this.msv = "B20DCCN001";
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    public String chuanHoaDate(){
        try {
            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
            Date date = fm.parse(dob); // String -> Date
            return fm.format(date); //Date ->String
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + chuanHoaDate() + " " + String.format("%.2f", gpa);
    }
}
public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien stu = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(stu);
        
   
    }
}
