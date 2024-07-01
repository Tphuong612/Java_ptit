
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class HocBong implements Comparable<HocBong>{
    private String ten;
    private double gpa, drl;
    private int xh;
    public HocBong(String ten, double gpa, double drl) {
        this.ten = ten;
        this.gpa = gpa;
        this.drl = drl;
    }

    public double getGpa() {
        return gpa;
    }

    public double getDrl() {
        return drl;
    }
    
    public int getXh() {
        return xh;
    }
    
    public String Loai(){
        if(gpa>=3.6 && drl>=90) return "XUATSAC";
        else if (gpa>=3.2 && drl>=80) return "GIOI";
        else if (gpa>=2.5 && drl>=70)return "KHA";
        return "KHONG";
    }
    @Override
    public String toString(){
        return ten;
    }
    @Override
    public int compareTo(HocBong o){
        return -Double.compare(gpa, o.gpa);
    }
}
public class J05062_HocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HocBong a[] = new HocBong[n];
        ArrayList<Double> xh = new ArrayList<>();
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            Double gpa = sc.nextDouble();
            Double drl = sc.nextDouble();
            a[i] = new HocBong(ten, gpa, drl);
            xh.add(gpa);
            sc.nextLine();
        }
        Collections.sort(xh, Collections.reverseOrder());
        double check = xh.get(m-1);
        for(HocBong i: a){
            if(i.getGpa()>= check){
                System.out.println(i+": "+i.Loai());
            }
            else{
                System.out.println(i+": KHONG");
            }
            
        }
    }
}
/*
in ra theo thu tu xuat hien :)
6 4
Nguyen Van Nam
3.59 75
Tran Hong Mai
3.61 90
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
Nguyen Van Nam2
3.59 75
Nguyen Van Nam3
3.62 70
*/