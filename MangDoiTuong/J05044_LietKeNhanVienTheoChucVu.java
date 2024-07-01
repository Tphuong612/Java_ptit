/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;

class LuongNV{
    private String name, chucvu, ma;
    private int luongcb, songay;
    public static int dem = 0;
    public LuongNV(String name, String chucvu, int luongcb, int songay){
        this.ma = String.format("NV%02d", ++dem);
        this.name = name;
        this.chucvu = chucvu;
        this.songay = songay;
        this.luongcb = luongcb;
    }
    public String getChucVu(){
        return chucvu;
    }
    public int luong(){
        return luongcb*songay;
    }
    public int Phu(){
        if(chucvu.equals("GD")) return 500;
        else if(chucvu.equals("PGD")) return 400;
        else if(chucvu.equals("TP")) return 300;
        else if(chucvu.equals("KT")) return 250;
        return 100;
    }
    public int TamUng(){
        double check = (Phu()+luong())*2/3.0;
        if(check<25000) return (int) Math.round(check/1000.0)*1000;
        return 25000;
    }
    public int Con(){
        return luong()+Phu()-TamUng();
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+Phu()+" "+luong()+" "+TamUng()+" "+Con();
    }
}
public class J05044_LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LuongNV a[] = new LuongNV[n];
        for(int i=0; i<n; i++){
            a[i] = new LuongNV(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        String s = sc.nextLine();
        for(int i=0; i<n; i++){
            if(a[i].getChucVu().equals(s))System.out.println(a[i]);
        }   
    }    
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/
