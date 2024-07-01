
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class CaThi implements Comparable<CaThi>{
    private String ma, phong;
    private Date ngay, gio, ss;
    private static int dem = 1;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hour = new SimpleDateFormat("HH:mm"); //h theo 12h, H theo 24h;
    SimpleDateFormat thoigian = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public CaThi(String ngay, String time, String phong) throws ParseException{
        this.ma = String.format("C%03d", dem++);
        this.ngay = date.parse(ngay);
        this.gio = hour.parse(time);
        this.phong = phong;
        String tmp = ngay + " " + time;
        this.ss = thoigian.parse(tmp);
    }
    @Override
    public String toString(){
        return ma +" "+ date.format(ngay)  +" "+ hour.format(gio)+" "+ phong;
    }
    @Override
    public int compareTo(CaThi o){
        if(!ss.equals(o.ss)) return ss.compareTo(o.ss);
        return ma.compareTo(o.ma);
    }
 
}
public class J07059_DanhSachCathi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
       Scanner sc = new Scanner(new File("CATHI.in"));
       int n = Integer.parseInt(sc.nextLine());
       ArrayList<CaThi> arr = new ArrayList<>();
       while(n-- >0){
           CaThi a = new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
           arr.add(a);
           //System.out.println(a);
       }
       Collections.sort(arr);
       for(CaThi i: arr){
           System.out.println(i);
       }
    }
}
