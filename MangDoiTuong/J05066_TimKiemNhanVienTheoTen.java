/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class Nv2 implements Comparable<Nv2>{
    private String ma, ten;
    private String cv, sohieu, hs;
    private static int demGD = 0, demTP = 0, demPP = 0;
    public Nv2(String ma, String ten) {
        this.ma = ma;
        this.ten = ten.trim();
        this.cv = ma.substring(0,2);
        if(cv.equals("GD")){
            demGD++;
            if(demGD > 1) cv = "NV";
        }
        if(cv.equals("TP")){
            demTP++;
            if(demTP > 3) cv = "NV";
        }
        if(cv.equals("PP")){
            demPP++;
            if(demPP > 3) cv = "NV";
        }
        this.hs = ma.substring(2, 4);
        this.sohieu = ma.substring(4);
    }

    public String getTen() {
        return ten;
    }
    
    
    @Override
    public String toString(){
        return ten+" "+cv+" "+sohieu+" "+hs;
    }
    @Override
    public int compareTo(Nv2 o){
        if(!hs.equals(o.hs)) return -hs.compareTo(o.hs);
        else return sohieu.compareTo(o.sohieu);
    }
}
public class J05066_TimKiemNhanVienTheoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //sc.nextLine();
        Nv2 a[] = new Nv2[n];
        for(int i=0; i<n; i++){
            String ma = sc.next();
            //sc.nextLine();
            String ten = sc.nextLine();
            a[i] = new Nv2(ma, ten);
        }
        Arrays.sort(a);
        int t = sc.nextInt();
        //sc.nextLine();
        while(t-- >0){
            String tk = sc.next().trim().toLowerCase();
            for(Nv2 i: a){
                if(i.getTen().toLowerCase().contains(tk)){
                    System.out.println(i);
                }
            }
            System.out.println("");
        }
    }
}
/*
7
GD08001 Nguyen Kim Loan
GD08005 Nguyen Kim Loan1
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
OA
aN
*/