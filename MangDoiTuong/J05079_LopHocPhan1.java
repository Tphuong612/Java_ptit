/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LopHocPhan implements Comparable<LopHocPhan>{
    private String ma, mon, nhom, gv;

    public LopHocPhan(String ma, String mon, String nhom, String gv) {
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
    
    @Override
    public String toString(){
        return nhom+" "+gv;
    }
    @Override
    public int compareTo(LopHocPhan o){
        return nhom.compareTo(o.nhom);
    }
}
public class J05079_LopHocPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LopHocPhan a[] = new LopHocPhan[n];
        for(int i=0; i<n; i++){
            a[i] = new LopHocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()); 
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- >0){
            String ma = sc.nextLine();
            ArrayList<LopHocPhan> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(ma.equals(a[i].getMa())){
                    System.out.println("Danh sach nhom lop mon "+a[i].getMon()+":");
                    break;
                }
            } 
            for(LopHocPhan i: a){
                if(i.getMa().equals(ma)){
                    arr.add(i);
                }
            }
            Collections.sort(arr);
            for(LopHocPhan i: arr){
                System.out.println(i);
            }
        }
        
    }
}
/*
4
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
01
Nguyen Binh An
1
THCS2D20
*/
