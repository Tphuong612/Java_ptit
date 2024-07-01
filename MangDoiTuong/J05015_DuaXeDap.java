/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class Dua implements Comparable<Dua>{
    private String ten, dv;
    private Date kt;
    private SimpleDateFormat sdf = new SimpleDateFormat("h:mm");

    public Dua(String ten, String dv, String kt) throws ParseException {
        this.ten = ten;
        this.dv = dv;
        this.kt = sdf.parse(kt);
        
    }
    
    public String ma(){
        String kq ="";
        String word1[] = ten.split(" +");
        String word2[] = dv.split(" +");
        for(int i=0; i<word2.length; i++){
            kq += word2[i].charAt(0);
        }
        for(int i=0; i<word1.length; i++){
            kq += word1[i].charAt(0);
        }
        return kq;
    }
    
    public double vt() throws ParseException{
        Date bd = sdf.parse("6:00");
        Duration d = Duration.between(bd.toInstant(), kt.toInstant());
        double tg = d.toMinutes()/60.0;
        return 120.0/tg;
    }
    @Override
    public String toString(){
        try {
            return ma()+" "+ ten+" "+dv+" "+String.format("%.0f", vt())+" Km/h";
        } catch (ParseException ex) {
            Logger.getLogger(Dua.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public int compareTo(Dua a){
        try {
            return -Double.compare(vt(), a.vt());
        } catch (ParseException ex) {
            Logger.getLogger(Dua.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
public class J05015_DuaXeDap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Dua[] a = new Dua[n];
        for(int i=0; i<n; i++){
            a[i] = new Dua(sc.nextLine(), sc.nextLine(), sc.nextLine());
            
        }
        Arrays.sort(a);
        for(Dua i: a){
            System.out.println(i);
        }
    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
*/