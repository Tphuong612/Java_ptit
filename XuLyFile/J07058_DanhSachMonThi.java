
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MonThi implements Comparable<MonThi>{
    private String ma, mon, hinhThuc;
    public MonThi(String ma, String mon, String hinhThuc){
        this.ma = ma;
        this.mon = mon;
        this.hinhThuc = hinhThuc;
    }
    @Override
    public String toString(){
        return ma + " " + mon + " " + hinhThuc;
    }
    @Override
    public int compareTo(MonThi o){
        return ma.compareTo(o.ma);
    }
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonThi> arr = new ArrayList<>();
        while(n-- >0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String hinhThuc = sc.nextLine();
            MonThi a = new MonThi(ma, name, hinhThuc);
            arr.add(a);
        }
        Collections.sort(arr);
        for(MonThi i: arr){
            System.out.println(i);
        }
    }
}
