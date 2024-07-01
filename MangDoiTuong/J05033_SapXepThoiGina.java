//// sap xep thoi gian neu chung o dang chuan 
//package MangDoiTuong;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
//
//class ThoiGian implements Comparable<ThoiGian>{
//    private Date d;
//    private static SimpleDateFormat sdf = new SimpleDateFormat("HH mm ss");
//    public ThoiGian(String date) throws ParseException{
//        this.d = sdf.parse(date);
//    }
//    @Override
//    public String toString(){
//        return sdf.format(d);
//    }
//    @Override
//    public int compareTo(ThoiGian o){
//        return d.compareTo(o.d);
//    }
//    
//}
//public class J05033_SapXepThoiGina{
//    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        ThoiGian a[] = new ThoiGian[t];
//        for(int i=0; i<t; i++){
//            a[i] = new ThoiGian(sc.nextLine());
//        }
//        Arrays.sort(a);
//        for(int i=0; i<t; i++){
//            System.out.println(a[i]);
//        }
//    }
//}
///*
//3
//11 20 20
//14 20 14
//11 15 12
//*/
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class ThoiGian implements Comparable<ThoiGian>{
    private int gio, phut, giay;
    public ThoiGian(int gio, int phut, int giay){
        if(gio < 100) this.gio = gio;
        if(phut > 0 && phut <= 59) this.phut = phut;
        if(giay > 0 && giay <= 59) this.giay = giay;
    }
    @Override
    public String toString(){
        return gio +" "+ phut +" "+ giay;
    }
    @Override
    public int compareTo(ThoiGian o){
        if(this.gio != o.gio) return this.gio - o.gio;
        if(this.phut != o.phut) return this.phut - o.phut;
        return this.giay - o.giay;
    }
    
}
public class J05033_SapXepThoiGina{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ThoiGian a[] = new ThoiGian[t];
        for(int i=0; i<t; i++){
            a[i] = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for(int i=0; i<t; i++){
            System.out.println(a[i]);
        }
    }
}