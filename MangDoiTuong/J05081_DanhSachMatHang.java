
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private String id, name, dv;
    private int mua, ban, lai;
    private static int dem = 1;
    public MatHang(String name, String dv, int mua, int ban){
        this.id = "MH" + String.format("%03d", dem++);
        this.name = name;
        this.dv = dv;
        this.ban = ban;
        this.mua = mua;
        this.lai = ban - mua;   
    }
    public String getId(){
        return id;
    }
    public int getLai(){
        return lai;
    }
   
    @Override
    public String toString(){
        return id + " " + name +" "+ dv +" "+ mua +" "+ ban +" "+ lai; 
    }
    
    @Override
    public int compareTo(MatHang o){
        if(this.lai == o.lai) return id.compareTo(o.getId());
        return -(this.lai - o.getLai());
    }   
}
public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang a[] = new MatHang[n];
        for(int i=0; i<n; i++){
            a[i] = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/