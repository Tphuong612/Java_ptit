
package MangDoiTuong;

import java.util.Scanner;

class PhuHo{
    private static int dem = 0;
    private String ten, ma;
    private String dob;
    private double lt, th;
    
    public PhuHo(String ten, String dob, double lt, double th) {
        this.ma = String.format("PH%02d", ++dem);
        this.ten = ten;
        this.dob = dob;
        this.lt = lt;
        this.th = th;
    }
    public int Tuoi(){
        int nam = Integer.parseInt(dob.substring(6));
        return 2021 - nam;
    }
    public double Thuong(){
        if(lt>=8 && th >=8) return 1;
        else if(lt>=7.5 && th>=7.5) return 0.5;
        return 0;
    }
    public int Tong(){
        int kq = (int) Math.round((lt + th)*0.5 + Thuong());
        if(kq > 10) return 10;
        return kq;
    }
    public String XepLoai(){
        if(Tong() < 5) return "Truot";
        else if(Tong()>=5 && Tong()<=6) return "Trung binh";
        else if(Tong()==7) return "Kha";
        else if(Tong()==8) return "Gioi";
        return "Xuat sac";
    }
    @Override
    public String toString(){
        return ma +" "+ten+ " "+ Tuoi() +" "+Tong()+" "+XepLoai();
    }
}
public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        PhuHo a[] = new PhuHo[n];
        for(int i=0; i<n; i++){
            a[i] = new PhuHo(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
*/
