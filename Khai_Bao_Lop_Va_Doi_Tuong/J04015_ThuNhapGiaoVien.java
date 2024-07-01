
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class GiaoVien{
    private String ma, name;
    private long lcb, phuCap;
    private int hso;
    GiaoVien(String ma, String name, long lcb){
        this.ma = ma;
        this.name = name;
        this.lcb = lcb;
    }
    public int hso(){
        String bac = ma.substring(2);
        return Integer.parseInt(bac);
    }
    public long phuCap(){
        long t = 0;
        String cv = ma.substring(0, 2);
        if(cv.equals("HT")) t = 2000000;
        else if (cv.equals("HP")) t = 900000;
        else if (cv.equals("GV")) t = 500000;
        return t;
    }
    public long luong(){
        long income = lcb * hso() + phuCap(); 
        return income;
    } 
    @Override
    public String toString(){
        return ma + " " + name + " " + hso() + " " + phuCap() + " " + luong();
    }
}
public class J04015_ThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(gv);
    }
}
