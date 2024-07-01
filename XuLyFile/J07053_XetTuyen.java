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
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class ThiSinh{
    private String ma;
    private String name, dob, loai;
    private int tuoi;
    private double lt, th, thuong;
    private String tong;
    private static int dem = 1;
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
    public final int TinhTuoi() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dob);
        
        Calendar cal = Calendar.getInstance();
        //int ht = cal.get(Calendar.YEAR);
        int ht = 2021;
        cal.setTime(date);
        int sinh = cal.get(Calendar.YEAR);
        return Math.abs(ht - sinh); 
    }
    public ThiSinh(String name, String dob, double lt, double th) throws ParseException{
        this.ma = String.format("PH%02d", dem++);
        this.name = convert(name);
        this.dob = dob;
        this.lt = lt;
        this.th = th;
        this.tuoi = TinhTuoi();
        this.thuong = DiemThuong();
        double sum = Math.round(0.5*(lt + th) + thuong);
        if(sum > 10) sum = 10;
        this.tong = chuan(sum);
        this.loai = XepLoai();
    }
    public final String chuan(double a){
        if(a == (int) a) return String.format("%d",(int)a);
        else return String.format("%.1f", a);
    }
    public final double DiemThuong(){
        if(lt>=8 && th >= 8) return 1;
        else if(lt>=7.5 && th>=7.5) return 0.5;
        else return 0;
    }
    public final String XepLoai(){
        if(Integer.parseInt(tong) < 5) return "Truot";
        else if(Integer.parseInt(tong) ==5 || Integer.parseInt(tong) == 6) return "Trung binh";
        else if(Integer.parseInt(tong) == 7) return "Kha";
        else if(Integer.parseInt(tong) == 8) return "Gioi";
        else if (Integer.parseInt(tong) == 9 || Integer.parseInt(tong) == 10) return "Xuat sac";
        return "";
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + tuoi + " " + tong + " " + loai;
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        while(n-- >0){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            ThiSinh a = new ThiSinh(name, dob, lt, th);
            arr.add(a);
        }
        for(ThiSinh i: arr){
            System.out.println(i);
        }
    }
 
}
