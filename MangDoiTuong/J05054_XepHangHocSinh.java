
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

class XepHang{
    private String ten, ma;
    private double  dtb;
    private static int dem = 0;
    public XepHang(String ten, double dtb){
        this.ten = ten;
        this.dtb = dtb;
        this.ma = String.format("HS%02d", ++dem);
    }
    public String XepLoai(){
        if(dtb<5) return "Yeu";
        else if(dtb>=5 && dtb<7) return "Trung Binh";
        else if(dtb>=7 && dtb<9) return "Kha";
        return "Gioi";
    }
    public double getDTB(){
        return dtb;
    }
    public int compareTo(XepHang a){
        return -Double.compare(dtb, a.dtb);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f", dtb)+" "+XepLoai();
    }
    
    
}
public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        XepHang a[] = new XepHang[n];
        ArrayList<Double> arr = new ArrayList<>();// chưa cac gia tri trung binh
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            double dtb = sc.nextDouble();
            a[i] = new XepHang(ten, dtb);
            arr.add(dtb);
            sc.nextLine();
        }
        Collections.sort(arr, (Double o1, Double o2) -> -Double.compare(o1, o2));
        int b[] = new int[n]; // mang b dung de chua stt;
        for(int i=0; i<n; i++){//gan gia tri cua mang b theo stt tu 1 den n;
            b[i] = i+1;
        }
        for(int i=1; i<n; i++){
            if(Objects.equals(arr.get(i), arr.get(i-1))) b[i] = b[i-1];
        }
//        
//        for(double i: arr){
//            System.out.println(i);
//        }
//        
        for(int i=0; i<n; i++){
            int k = arr.indexOf(a[i].getDTB());
            System.out.println(a[i] + " " + b[k]);
        }
        
    }
}
/*
8
Nguyen Thi Nam
5.9
Tran Hai Nam
8.6
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
Tran Phuong
9.2
Nguyen Van A
10
Nguyen Van C
9.2
*/
