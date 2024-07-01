/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


class Khach implements Comparable<Khach>{
    private static int dem = 1;
    private String id, name, phong;
    private Date den, di;
    private int luu;

    public Khach(String name, String phong, String den, String di) throws ParseException{
        this.id = "KH" + String.format("%02d", dem++);
        this.name = name;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.den = sdf.parse(den);
        this.di = sdf.parse(di);
        this.luu =(int) ((int) (sdf.parse(di).getTime() - sdf.parse(den).getTime())/(1000L*60*60*24)); 
    }
    public int getLuu(){
        return luu;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + phong + " " + luu;
    }
    @Override
    public int compareTo(Khach other){
        return -(this.luu - other.getLuu());
    }
    
}
public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr = new ArrayList<>();
        while(n-- >0){
            String name = sc.nextLine();
            String phong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            Khach a = new Khach(name, phong, den, di);
            arr.add(a);  
        }
        Collections.sort(arr);
        for(Khach i: arr){
            System.out.println(i);
        }
    }
}
