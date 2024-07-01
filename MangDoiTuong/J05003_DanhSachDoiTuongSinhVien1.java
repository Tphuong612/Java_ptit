
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private float gpa;
    private String dob, lop, name;
    private String msv;
    private static int dem = 1;
    public SinhVien() throws ParseException{
        this("", "", "", 0);
    }
    public SinhVien(String name, String lop, String dob, float gpa) throws ParseException{
        this.msv = String.format("B20DCCN%03d", dem++);
        this.name = name;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dob);
        this.dob = sdf.format(date);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
public class J05003_DanhSachDoiTuongSinhVien1 {
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
        for(SinhVien i: a){
            System.out.println(i);
        }
    }
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/