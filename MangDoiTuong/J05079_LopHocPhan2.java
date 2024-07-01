
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LopHocPhan2 implements Comparable<LopHocPhan2>{
    private String ma, mon, nhom, gv;

    public LopHocPhan2(String ma, String mon, String nhom, String gv) {
        this.ma = ma;
        this.mon = mon;
        this.nhom = nhom;
        this.gv = gv;
    }

    public String getMa() {
        return ma;
    }

    public String getMon() {
        return mon;
    }

    public String getGv() {
        return gv;
    }
    
    @Override
    public String toString(){
        return ma+" "+mon+" "+nhom;
    }
    @Override
    public int compareTo(LopHocPhan2 o){
        if(!ma.equals(o.ma)) return ma.compareTo(o.ma);
        return nhom.compareTo(o.nhom);
    }
}
public class J05079_LopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LopHocPhan2 a[] = new LopHocPhan2[n];
        for(int i=0; i<n; i++){
            a[i] = new LopHocPhan2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()); 
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String gv = sc.nextLine();
            ArrayList<LopHocPhan2> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(gv.equals(a[i].getGv())){
                    System.out.println("Danh sach cho giang vien "+gv+":");
                    break;
                }
            } 
            for(LopHocPhan2 i: a){
                if(i.getGv().equals(gv)){
                    arr.add(i);
                }
            }
            Collections.sort(arr);
            for(LopHocPhan2 i: arr){
                System.out.println(i);
            }
        }
        
    }   
}
/*
5
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
02
Nguyen Binh An
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
*/