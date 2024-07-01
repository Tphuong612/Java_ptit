
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien7038 {
    private String msv, ht, lp, mail, dn;
    public String convert(String name){
        String word[] = name.trim().toLowerCase().split(" +");
        String kq = "";
        for(int i=0; i<word.length; i++){
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1) kq += " ";
        }
        return kq;
    }
    public SinhVien7038(String msv, String ht, String lp, String mail) {
        this.msv = msv;
        this.ht = convert(ht);
        this.lp = lp;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }
    public void setDn(String dn) {
        this.dn = dn;
    }
    @Override
    public String toString(){
        return msv+" "+ht+" "+lp;
    }
    
}
class DoanhNghiep7038{
    private String ma, ten;
    private int sl;

    public DoanhNghiep7038(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSl() {
        return sl;
    }
}
class ThucTap7038 implements Comparable<ThucTap7038>{
    private String msv, mdn;
    public ThucTap7038(String msv, String mdn) {
        this.msv = msv;
        this.mdn = mdn;
    }

    public String getMsv() {
        return msv;
    }

    public String getMdn() {
        return mdn;
    }
    @Override
    public int compareTo(ThucTap7038 o){
        return msv.compareTo(o.msv);
    }   
}
public class J07038_DanhSachThucTap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("D:\\Hoc Tap\\code\\java\\SINHVIEN.in.txt"));
        int n = Integer.parseInt(sc1.nextLine());
        SinhVien7038 a[] = new SinhVien7038[n];
        for(int i=0; i<n; i++){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();
            a[i] = new SinhVien7038(ma, ten, lop, email);
        }
        
        Scanner sc2 = new Scanner(new File("D:\\Hoc Tap\\code\\java\\DN.in.txt"));
        int m = Integer.parseInt(sc2.nextLine());
        DoanhNghiep7038 b[] = new DoanhNghiep7038[m];
        for(int i=0; i<m; i++){
            String ma = sc2.nextLine();
            String ten = sc2.nextLine();
            int sl = Integer.parseInt(sc2.nextLine());
            b[i] = new DoanhNghiep7038(ma, ten, sl);
        }
        
        Scanner sc3 = new Scanner(new File("D:\\Hoc Tap\\code\\java\\THUCTAP.in.txt"));
        int p = Integer.parseInt(sc3.nextLine());
        ThucTap7038 c[] = new ThucTap7038[p];
        for(int i=0; i<p; i++){
            String word[] = sc3.nextLine().trim().split(" +");
            String dn = word[0];
            String sv = word[1];
            c[i] = new ThucTap7038(dn, sv);
        }
        int q = Integer.parseInt(sc3.nextLine());
        while(q-- >0){
            String dn = sc3.nextLine();
            String ten = "";
            int sl = 0;
            for(DoanhNghiep7038 i: b){
                if(dn.equals(i.getMa())){
                    ten = i.getTen();
                    sl = i.getSl();
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI "+ten+":");
            ArrayList<ThucTap7038> arr = new ArrayList<>();
            for(int i=0; i<p; i++){
                if(c[i].getMdn().equals(dn)){
                    arr.add(c[i]);
                }
            }
            Collections.sort(arr);
            for(int i=0; i<arr.size(); i++){
                if(i+1 <= sl){
                    for(SinhVien7038 j: a){
                        if(arr.get(i).getMsv().equals(j.getMsv())) System.out.println(j); 
                    }
                }
            
            }
        }
    }
}
