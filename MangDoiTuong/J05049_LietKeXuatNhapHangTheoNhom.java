/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class NhapXuat implements Comparable<NhapXuat>{
    private String ma;
    private int slNhap;
    public NhapXuat(String ma, int sl){
        this.ma = ma;
        this.slNhap = sl;
    }
    public int XuatHang(){
        if(ma.charAt(0) == 'A') return (int) Math.round(slNhap*0.6);
        else if(ma.charAt(0) == 'B') return (int) Math.round(slNhap*0.7);   
        return 0;
    } 
    public int DonGia(){
        int k = ma.length();
        if(ma.charAt(k-1)=='Y') return 110000;
        else if (ma.charAt(k-1)=='N') return 135000;
        return 0;
    }
    public int Tien(){
        return DonGia()*XuatHang();
    }
    public long Thue(){
        if(ma.startsWith("A") && ma.endsWith("Y")) return (long) Math.round(0.08*Tien()/10)*10;
        else if(ma.startsWith("A") && ma.endsWith("N")) return (long) Math.round(0.11*Tien()/10)*10;
        else if(ma.startsWith("B") && ma.endsWith("Y")) return (long) Math.round(0.17*Tien()/10)*10;
        else if(ma.startsWith("B") && ma.endsWith("N")) return (long) Math.round(0.22*Tien()/10)*10;
        return 0;
    }
    public String getMa(){
        return ma;
    }
    public int compareTo(NhapXuat a){
        return -Long.compare(Thue(), a.Thue());
    }
    @Override
    public String toString(){
        return ma+" "+slNhap+" "+XuatHang()+" "+DonGia()+" "+Tien()+" "+Thue();
    }
}
public class J05049_LietKeXuatNhapHangTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhapXuat a[] = new NhapXuat[n];
        for(int i=0; i<n; i++){
            a[i] = new NhapXuat(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        String s = sc.nextLine();
        for(int i=0; i<n; i++){
            if(a[i].getMa().startsWith(s)) System.out.println(a[i]);
        }
    }    
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B
*/