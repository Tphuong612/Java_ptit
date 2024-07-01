package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String ma, name, lt, th;
    private int tin;
    public MonHoc(String ma, String name, int tin, String lt, String th){
        this.ma = ma;
        this.name = name;
        this.tin = tin;
        this.lt = lt;
        this.th = th;
    }

    public void xuat(){
        if(th.equals("Truc tuyen") || th.endsWith(".ptit.edu.vn"))
            System.out.println(ma +" "+ name +" "+ tin +" "+lt+" "+th); 
        
    }
    @Override
    public int compareTo(MonHoc o){
        return ma.compareTo(o.ma);
    }
}
public class J07073_DangKiHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\Hoc Tap\\code\\java\\MONHOC.in.txt"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        while(n-- >0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int tin = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine();
            String th = sc.nextLine();
            MonHoc a = new MonHoc(ma, name, tin, lt, th);
            arr.add(a);
        }
        Collections.sort(arr);
        for(MonHoc i: arr){
            i.xuat();
        }
    }
}
