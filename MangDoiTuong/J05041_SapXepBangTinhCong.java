package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TinhCong implements Comparable<TinhCong>{
    private String ma, name, chucvu;
    private int luongcb_ngay, songay;
    private static int dem = 0;
    public TinhCong(String name, int luongcb, int songay, String chucvu){
        this.ma = String.format("NV%02d", ++dem);
        this.name = name;
        this.luongcb_ngay = luongcb;
        this.chucvu = chucvu;
        this.songay = songay;       
    }
    public int Luong(){
        return luongcb_ngay*songay;
    }
    public int Thuong(){
        if(songay>=25) return 20*Luong()/100;
        else if(songay>=22) return 10*Luong()/100;
        return 0;
    }
    public int Phu(){
        if(chucvu.equals("GD")) return 250000;
        else if(chucvu.equals("PGD")) return 200000;
        else if(chucvu.equals("TP")) return 180000;
        else if(chucvu.equals("NV")) return 150000;
        return 0;
    }
    public int Tong(){
        return Luong()+Thuong()+Phu();
    }
    @Override
    public int compareTo(TinhCong a){
        return -Integer.compare(Tong(), a.Tong());
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+Luong()+" "+Thuong()+" "+Phu()+" "+Tong();
    }
    
}
public class J05041_SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();
        TinhCong a[] = new TinhCong[n];
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            int luongngay = sc.nextInt();
            int ngay = sc.nextInt();
            sc.nextLine();
            String chucvu = sc.nextLine();
            a[i] = new TinhCong(ten, luongngay, ngay, chucvu);
        } 
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
     
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/