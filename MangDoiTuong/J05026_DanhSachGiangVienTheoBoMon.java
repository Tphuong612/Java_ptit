/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class GiaoVien{
    private String ma, ten, mon;
    private static int dem = 0;
    public GiaoVien(String ten, String mon){
        this.ma = String.format("GV%02d", ++dem);
        this.ten = ten;
        String word[] = mon.toUpperCase().split(" +");
        String kq = "";
        for(String i: word){
            kq += i.charAt(0);
        }
        this.mon = kq;
    }
    public String getMon(){
        return mon;
    }
    @Override
    public String toString(){
        return ma + " "+ ten+ " " + mon;
    }

}
public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GiaoVien a[] = new GiaoVien[n];
        for(int i=0; i<n; i++){
            a[i] = new GiaoVien(sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while( q-- >0){
            String s = sc.nextLine();
            String mon ="";
            String word[] = s.toUpperCase().split(" +");
            for(String i: word){
                mon += i.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+mon+":");
            for(int i=0; i<n; i++){
                if(a[i].getMon().equals(mon))System.out.println(a[i]);
            }
        
        }
 
    }   
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
3
Cong nghe phan mem
*/