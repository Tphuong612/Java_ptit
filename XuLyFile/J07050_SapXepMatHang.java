/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MatHang implements Comparable<MatHang>{
    private String id, name, nhom;
    private float mua, ban, lai;
    private static int dem = 1;
    public MatHang(String name, String nhom, float mua, float ban){
        this.id = "MH" + String.format("%02d", dem++);
        this.name = name;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.lai = ban - mua;
    }
    public float getLai(){
        return this.lai;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + nhom + " " + String.format("%.2f", lai);
    }
    
    @Override
    public int compareTo(MatHang o)
    {
        if (lai < o.getLai())
            return 1;
        else if (lai > o.getLai())
            return -1;
        return 0;
    }

}


public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        
        while(n-- >0){
            
            String name = sc.nextLine();
            String nhom = sc.nextLine();
            float mua = Float.parseFloat(sc.nextLine());
            float ban = Float.parseFloat(sc.nextLine());
            MatHang a = new MatHang(name, nhom, mua, ban);
            arr.add(a);       
        }
        Collections.sort(arr);
        for(MatHang i:  arr){
            System.out.println(i);
        }
    }
}
