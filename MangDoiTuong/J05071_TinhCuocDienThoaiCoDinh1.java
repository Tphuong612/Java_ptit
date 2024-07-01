
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class ThanhPho{
    private String mavung, ten;
    private int giacuoc;

    public ThanhPho(String mavung, String ten, int giacuoc) {
        this.mavung = mavung;
        this.ten = ten;
        this.giacuoc = giacuoc;
    }

    public String getMavung() {
        return mavung;
    }

    public String getTen() {
        return ten;
    }

    public int getGiacuoc() {
        return giacuoc;
    }
    
}
class CuocGoi implements Comparable<CuocGoi>{
    private String thuebao, tinh;
    private Date bd, kt;
    private int giaphut;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    public CuocGoi(String thuebao, String bd, String kt) throws ParseException {
        this.thuebao = thuebao;
        this.bd = sdf.parse(bd);
        this.kt = sdf.parse(kt);
    }
    public long Tg(){
        Duration dur = Duration.between(bd.toInstant(), kt.toInstant());
        long phut = dur.toMinutes();
        if(thuebao.charAt(0) != '0') return Math.round(phut/3.0);
        return phut;
    }

    public String getThuebao() {
        return thuebao;
    }
    
    public void setGiaphut(int giaphut) {
        this.giaphut = giaphut;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    
    public long gia(){
        return giaphut*Tg();
    }
    
    @Override
    public String toString(){
        return thuebao + " " + tinh + " "+ Tg() +" "+gia();
    }
    @Override
    public int compareTo(CuocGoi o){
        return -Long.compare(gia(), o.gia());
    }
    
    
}
public class J05071_TinhCuocDienThoaiCoDinh1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThanhPho[] a = new ThanhPho[n];
        for(int i=0; i<n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            a[i] = new ThanhPho(ma, ten, gia);
        }
        int m = sc.nextInt();
        //sc.nextLine();
        CuocGoi[] b = new CuocGoi[m];
        for(int i=0; i<m; i++){
            String ma = sc.next();
            String bd = sc.next();
            String kt = sc.next();
            b[i] = new CuocGoi(ma, bd, kt);
        }
        for(CuocGoi i: b){
            if(i.getThuebao().charAt(0) != '0'){
                i.setTinh("Noi mang");
                i.setGiaphut(800);
            }
            else {
                String ma = i.getThuebao().substring(1,3);
                for(ThanhPho j: a){
                    if(ma.equals(j.getMavung())){
                        i.setGiaphut(j.getGiacuoc());
                        i.setTinh(j.getTen());
                    }
                }
            }
        }
        Arrays.sort(b);
        for(CuocGoi i: b){
            System.out.println(i);
        }
       
    }
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
*/