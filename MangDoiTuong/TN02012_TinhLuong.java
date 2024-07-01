
package MangDoiTuong;

import java.util.Scanner;

class PhongBan2{
    private String MaPhong, TenPhong;

    public PhongBan2(String MaPhong, String TenPhong) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong.trim();
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }
    
}
class TinhLuong2{
    private String MNV, TenNV, PhongBan, MaPhongBan;
    private int Luong, SoNgayCong;

    public TinhLuong2(String MNV, String TenNV, int Luong, int SoNgayCong) {
        this.MNV = MNV;
        this.TenNV = TenNV.trim();
        this.Luong = Luong;
        this.SoNgayCong = SoNgayCong;
        this.MaPhongBan = MNV.substring(MNV.length()-2);
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }
    public int HeSo(){
        char nhom = MNV.charAt(0);
        int nam = Integer.parseInt(MNV.substring(1,3));
        if(nhom == 'A'){
            if(nam>=1 && nam <=3) return 10;
            else if(nam>=4 && nam <=8) return 12;
            else if(nam>=9 && nam <=15) return 14;
            else if(nam>=16) return 20;
        }
        if(nhom == 'B'){
            if(nam>=1 && nam <=3) return 10;
            else if(nam>=4 && nam <=8) return 11;
            else if(nam>=9 && nam <=15) return 13;
            else if(nam>=16) return 16;
        }
        if(nhom == 'C'){
            if(nam>=1 && nam <=3) return 9;
            else if(nam>=4 && nam <=8) return 10;
            else if(nam>=9 && nam <=15) return 12;
            else if(nam>=16) return 14;
        }
        if(nhom == 'D'){
            if(nam>=1 && nam <=3) return 8;
            else if(nam>=4 && nam <=8) return 9;
            else if(nam>=9 && nam <=15) return 11;
            else if(nam>=16) return 13;
        }
        return 0;
    }
    public long Tong(){
        return Luong*SoNgayCong*1000*HeSo();
    }
   
    @Override
    public String toString(){
        return MNV+" "+TenNV+" "+PhongBan+" "+Tong();
    }

}
public class TN02012_TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        PhongBan2 a[] = new PhongBan2[n];
        for(int i=0; i<n; i++){
            a[i] = new PhongBan2(sc.next(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        TinhLuong2 b[] = new TinhLuong2[m];
        for(int i=0; i<m; i++){
            b[i] = new TinhLuong2(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        
        for(int i=0; i<m; i++){
            for(PhongBan2 j: a){
                if(b[i].getMaPhongBan().equals(j.getMaPhong())) b[i].setPhongBan(j.getTenPhong());
            }
            
        }
        for(TinhLuong2 i: b){
            System.out.println(i);
        }
    }   
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/