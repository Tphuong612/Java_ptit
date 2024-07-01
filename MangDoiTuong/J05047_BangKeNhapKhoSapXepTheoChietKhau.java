
package MangDoiTuong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class KhoHang implements Comparable<KhoHang>{
    private String ten, ma;
    private int dongia, sl;
    private static int dem = 0;
    private static HashMap<String, Integer> tm = new HashMap<>();
    
    public KhoHang(String name, int sl, int dongia){
        this.ten = name;
        String word[] = name.toUpperCase().split(" +");
        String tmp = "" + word[0].charAt(0) + word[1].charAt(0);
        if(tm.containsKey(tmp)) tm.put(tmp, tm.get(tmp)+1);
        else tm.put(tmp, 1);
        this.ma = String.format("%s%02d", tmp, tm.get(tmp));
        this.dongia = dongia;
        this.sl = sl;
    }
    public int Bandau(){
        return sl*dongia;
    }
    public int Chietkhau(){
        if(sl>10) return 5*Bandau()/100;
        else if(sl>=8 && sl<=10) return 2*Bandau()/100;
        else if(sl>=5 && sl<8) return 1*Bandau()/100;
        return 0;
    }
    public int ThanhTien(){
        return Bandau()-Chietkhau();
    }
    @Override
    public int compareTo(KhoHang a){
        return -Integer.compare(Chietkhau(), a.Chietkhau());
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+Chietkhau()+" "+ThanhTien();
    }
    
}
public class J05047_BangKeNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        KhoHang a[] = new KhoHang[n];
        for(int i=0; i<n; i++){
            a[i] = new KhoHang(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/
