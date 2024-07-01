
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;

class TienDien{
    private String ma, loai;
    private int cu, moi;
    private static int dem = 0;
    public TienDien(String loai, int cu, int moi){
        this.ma = String.format("KH%02d", ++dem);
        this.moi = moi;
        this.cu = cu;
        this.loai = loai;         
    }
    public int HeSo(){
        if(loai.equals("KD")) return 3;
        else if(loai.equals("NN")) return 5;
        else if(loai.equals("TT")) return 4;
        else if(loai.equals("CN")) return 2;
        return 0;
    }
    public int ThanhTien(){
        return (moi-cu)*HeSo()*550;
    }
    public int PhuTroi(){
        int k = moi - cu;
        if(k<50) return 0;
        else if(k>=50 && k<=100) return (int) Math.ceil(ThanhTien()*0.35);
        return ThanhTien();
    }
    public int Tong(){
        return PhuTroi()+ThanhTien();
    }
    @Override
    public String toString(){
        return ma+" "+HeSo()+" "+ThanhTien()+" "+PhuTroi()+" "+Tong();
    }
}
        
public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TienDien a[] = new TienDien[n];
        for(int i=0; i<n; i++){
            a[i] = new TienDien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }

        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/
