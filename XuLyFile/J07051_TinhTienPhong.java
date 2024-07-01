
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Khach implements Comparable<Khach>{
    private String ma, ten, phong;
    private int ngay, dv, tang;
    private Date nhan, tra;
    private static int dem = 1;
    public String convert(){
        String word[] = ten.trim().toLowerCase().split(" +");
        String kq = "";
        for (int i=0; i<word.length; i++) {
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1){
                kq += " ";
            }
        }
        return kq;
    }
    public Khach(String ten, String phong, String nhan, String tra, int dv) throws ParseException{
        this.ma = "KH" + String.format("%02d", dem++);
        this.ten = ten;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.nhan = sdf.parse(nhan);
        this.tra = sdf.parse(tra);
        this.ngay = (int) (ChronoUnit.DAYS.between(this.nhan.toInstant(), this.tra.toInstant()) + 1);
        this.tang = phong.charAt(0) - '0';
        this.dv = dv;
    }
    public int tien(){
        int phi = 0;
        if(tang == 1) phi = 25;
        else if(tang == 2) phi = 34;
        else if(tang == 3) phi = 50;
        else phi = 80;
        return phi*ngay + dv;
    }
    @Override
    public String toString(){

        return ma +" "+ convert() +" "+ phong + " "+ngay+ " " + tien(); 
    }
    
    @Override
    public int compareTo(Khach o){
        return -(this.tien() - o.tien());
    }
}
public class J07051_TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr = new ArrayList<>();
        while(n-- >0){
            Khach a = new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr);
        for(Khach i: arr){
            System.out.println(i);
        }
        
    }
    
    
}
