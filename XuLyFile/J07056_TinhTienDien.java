
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class KhachHang implements Comparable<KhachHang>{
    private String ma, name, ho;
    private int dau, cuoi, sum, VAT, in, out;
    private static int dem = 1;
    private int dinh;
    public KhachHang(String name, String ho, int dau, int cuoi){
        this.ma = String.format("KH%02d", dem++);
        this.name = convert(name);
        this.ho = ho;
        this.dau = dau;
        this.cuoi = cuoi;
  
        if(ho.equals("A")) this.dinh = 100;
        else if(ho.equals("B")) this.dinh = 500;
        else if (ho.equals("C")) this.dinh = 200;
        
        this.in = tienIn();
        this.out = tienOut();
        this.VAT = out/20;
        this.sum = tong();
    }
    public final String convert(String ten){
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
    public final int tienIn(){
        int x = cuoi - dau;
        if(x < dinh) return x*450;
        else return dinh*450;
    }
    public final int tienOut(){
        int x = cuoi - dau;
        if(x > dinh) return (x - dinh)*1000;
        else return 0;
    }
    
    public final int tong(){
        return in + out + VAT;
    }
    @Override
    public String toString(){
        return ma +" "+ name +" "+ in +" "+ out +" "+ VAT +" "+ sum;
    }
    @Override
    public int compareTo(KhachHang o){
        return -(sum - o.sum);
    }
}
public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        while(n-- >0){
            String name = sc.nextLine();
            String thongTin[] = sc.nextLine().split(" +");
            String ho = thongTin[0];
            int dau = Integer.parseInt(thongTin[1]);
            int cuoi = Integer.parseInt(thongTin[2]);
            KhachHang a = new KhachHang(name, ho, dau, cuoi);
            //System.out.println(cuoi + " " + dau);
            arr.add(a);
        }
        Collections.sort(arr);
        for(KhachHang i: arr){
            System.out.println(i);
        }
    }
}
