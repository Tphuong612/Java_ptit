/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class HocSinh implements Comparable<HocSinh>{
    private String ma, ten;
    private double diem[] = new double[10];
    private static int dem = 0; 
    public HocSinh(String a, double b[]){
        this.ma = String.format("HS%02d", ++dem);
        this.ten = a;
        for(int i=0; i<10; i++){
            this.diem[i] = b[i];
        }
    }
    
    public double average(){
        double sum = 0;
        for(int i=0; i<10; i++){
            if(i==1||i==0) sum += diem[i]*2;
            else sum += diem[i];
        }
        sum = sum/12;
        return Math.round(sum*10.0)/10.0; //l0.0 la lm tron den chu so thap phan t1   
    }
    public String Loai(){
        
        double a = average();
        if(a>=9) return "XUAT SAC";
        else if(a>=8 && a<9) return "GIOI";
        else if(a>=7 && a<8) return "KHA";
        else if(a>=5 && a<7) return "TB";
        return "YEU";
         
    }
    
    @Override
    public String toString(){
        
        return ma +" "+ ten +" "+ average() +" "+Loai();
    }
    @Override
    public int compareTo(HocSinh a){
        return -Double.compare(average(),a.average());
    }
}
public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HocSinh a[] = new HocSinh[n];
        for(int i = 0; i<n; i++){
            String ten = sc.nextLine();
            double diem[] = new double[10];
            
            for(int j=0; j<10; j++){
                diem[j] = sc.nextDouble();
            }
            a[i] = new HocSinh(ten, diem);
            sc.nextLine();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/
