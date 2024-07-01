
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class NhanVien{
   private String id = "00001";
   private String name, gt, ns, dc, tax, nk;
   
   public NhanVien(){
       this("00001", "", "", "", "", "");
   }
   public NhanVien(String name, String gt, String ns, String dc, String tax, String nk){
       this.id = "00001";
       this.name = name;
       this.gt = gt;
       this.ns = ns;
       this.dc = dc;
       this.tax = tax;
       this.nk = nk;
   }
   public String chuanHoa(String s){
       try{
           SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
           Date date = fm.parse(s);
           return fm.format(date);
       } catch (ParseException e){
           System.out.println(e);
       }
       return "";
   }
   @Override
   public String toString(){
       return id +" "+ name +" "+ gt +" "+ chuanHoa(ns) +" "+ dc +" "+ tax +" "+ chuanHoa(nk);
   }
}
public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
        
    }
}
