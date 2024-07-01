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

/**
 *
 * @author Admin
 */
class MonHoc implements Comparable<MonHoc>{
    private String id, name;
    private int tin;
    public MonHoc(String id, String name, int tin){
        this.id = id;
        this.name = name;
        this.tin = tin;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return id + ' ' + name + ' ' + tin;
    }
    
    @Override
    public int compareTo(MonHoc a){
        return name.compareTo(a.getName());
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        while(n-- >0){
           String id = sc.nextLine();
           String name = sc.nextLine();
           int tin = Integer.parseInt(sc.nextLine());
           MonHoc a = new MonHoc(id, name, tin);
           arr.add(a);
        }
        Collections.sort(arr);
        for(MonHoc i: arr){
            System.out.println(i);
        }
        
    }
}
