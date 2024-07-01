/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;

class SinhVien {
    private String name, lop, msv, email, nganh;
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.nganh = msv.substring(3,7);
    }
    public String nganh(){
       return nganh;
    }
    public String getLop(){
        return lop;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " +lop+ " "+email;
    }
    
}
public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien a[] = new SinhVien[n];
        for(int i=0; i<n; i++){
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());    
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            String kq ="";
            if(s.equals("Ke toan")) kq = "DCKT";
            else if(s.equals("Cong nghe thong tin")) kq = "DCCN";
            else if(s.equals("An toan thong tin")) kq = "DCAT";
            else if(s.equals("Vien thong")) kq = "DCVT";
            else if(s.equals("Dien tu")) kq = "DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() +":");
            for(SinhVien i: a){
                if((i.nganh()).equals(kq)){
                    if(!i.nganh().equals("DCCN") && !i.nganh().equals("DCAT")) System.out.println(i);
                    else if(!i.getLop().startsWith("E")) System.out.println(i);
                }
                                    
                
            }
        }
        
    }    
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
E15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Cong nghe thong tin
*/