
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String name, ma;
    private int mon1, mon2, mon3, thuHang;
    private float tb;
    private static int dem = 0;
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

    public SinhVien(String name, int mon1, int mon2, int mon3){
        this.ma = String.format("SV%02d", ++dem);
        this.name = convert(name);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.tb = (float) (3*mon1 + 3*mon2 + 2*mon3)/8;    
        this.thuHang = dem;
    }
    public int getRank(){
        return thuHang;
    }
    public float getTb(){
        return tb;
    }
    public void setRank(int x){
        this.thuHang = x;
    }

    @Override
    public String toString(){
        return ma + " " + name +" "+ String.format("%.2f", tb) +" "+ thuHang;
    }
    @Override
    public int compareTo(SinhVien a){
        if(tb != a.tb) return -Float.compare(tb, a.tb);
        return ma.compareTo(a.ma);
    }
    
    
}
public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien arr[] = new SinhVien[n];
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            int mon1 = Integer.parseInt(sc.nextLine());
            int mon2 = Integer.parseInt(sc.nextLine());
            int mon3 = Integer.parseInt(sc.nextLine());
            arr[i] = new SinhVien(name, mon1, mon2, mon3);
        }
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++){
            arr[i].setRank(i+1);
        }
        for(int i = 0; i< arr.length; i++){

            if(i+1<arr.length && arr[i].getTb() == arr[i+1].getTb()){
                arr[i+1].setRank(arr[i].getRank());
            }

            System.out.println(arr[i]);
        }
    }
}
