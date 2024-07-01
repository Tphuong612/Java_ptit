
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class SinhVien implements Comparable<SinhVien>{
    private float gpa;
    private String dob, lop, name;
    private String msv;
    private static int dem = 1;
    public SinhVien() throws ParseException{
        this("", "", "", 0);
    }
    public SinhVien(String name, String lop, String dob, float gpa) throws ParseException{
        this.msv = String.format("B20DCCN%03d", dem++);
        this.name = convert(name);
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dob);
        this.dob = sdf.format(date);
        this.gpa = gpa;
    }
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
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    @Override
    public int compareTo(SinhVien o){
        return Float.compare(o.gpa, gpa);
    }
}
public class J05005_DanhSachDoiTuongSinhVien3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien a[] = new SinhVien[n];
        sc.nextLine();
        for(int i= 0; i< n; i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = sc.nextFloat();
            sc.nextLine();
            a[i] = new SinhVien(name, lop, dob, gpa);
        }
        Arrays.sort(a);
        for(SinhVien i: a){
            System.out.println(i);
        }
    }    
}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/
