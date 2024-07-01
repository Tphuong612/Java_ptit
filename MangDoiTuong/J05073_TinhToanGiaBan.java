
package MangDoiTuong;

import java.util.Scanner;

class TinhToan{
    private String ma;
    private int dongia, sl;

    public TinhToan(String ma, int dongia, int sl) {
        this.ma = ma;
        this.dongia = dongia;
        this.sl = sl;
    }
    
    public double thue(){
        char c = ma.charAt(0);
        if(c == 'T') return 0.29;
        else if(c == 'C') return 0.10;
        else if(c == 'D') return 0.08;
        else if(c == 'M') return 0.02;
        return 0;
    }
    
    public double vch(){
        char c = ma.charAt(0);
        if(c == 'T') return 0.04;
        else if(c == 'C') return 0.03;
        else if(c == 'D') return 0.025;
        else if(c == 'M') return 0.005;
        return 0;
    }
    
    public double giamthem(){
        if(ma.endsWith("C")) return thue()*0.05;
        return 0;
    }
    
    public double gia(){
        return dongia*(1+thue()+vch()-giamthem())*1.2;
    }
    
    @Override
    public String toString(){
        return ma+" "+String.format("%.2f", gia());
    }
}
public class J05073_TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TinhToan a[] = new TinhToan[n];
        for(int i=0; i<n; i++){
            a[i] = new TinhToan(sc.next(), sc.nextInt(), sc.nextInt());
        }
        for(TinhToan i: a){
            System.out.println(i);
        }
    }
}
/*
2
TTVC 400 300
CCAK 200 200
*/