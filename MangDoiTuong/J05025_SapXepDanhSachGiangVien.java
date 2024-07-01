
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;
class GiaoVien implements Comparable<GiaoVien>{
    private String ma, ten, mon;
    private static int dem = 0;
    public GiaoVien(String ten, String mon){
        this.ma = String.format("GV%02d", ++dem);
        this.ten = ten;
        String word[] = mon.toUpperCase().split(" +");
        String kq = "";
        for(String i: word){
            kq += i.charAt(0);
        }
        this.mon = kq;
    }
    @Override
    public String toString(){
        return ma + " "+ ten+ " " + mon;
    }
    @Override
    public int compareTo(GiaoVien a){
        String word[] = ten.split(" +");
        String ten1 = word[word.length-1];
        String word2[] = a.ten.split(" +");
        String ten2 = word2[word2.length-1];
        if(ten1.equals(ten2)) return ma.compareTo(a.ma);
        return ten1.compareTo(ten2);
    }
}
public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GiaoVien a[] = new GiaoVien[n];
        for(int i=0; i<n; i++){
            a[i] = new GiaoVien(sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/