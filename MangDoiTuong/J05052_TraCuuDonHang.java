/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;
class MatHang{
    private String ma, tenMatHang, stt, loai;
    private String ten;
    private int gia, sl;
    public MatHang(String ten, String ma, int gia, int sl){
        this.ten = ten;
        this.ma = ma;
        this.tenMatHang = ma.substring(0,1);
        this.stt = ma.substring(1,4);
        this.loai = ma.substring(4, 5);
        this.gia = gia;
        this.sl = sl; 
        
    }
    public int giamGia(){
        if("2".equals(loai)) return (int) (gia*sl*0.3) ;
        else if("1".equals(loai)) return (int) (gia*sl*0.5);
        return 0;
    }
    public int ThanhTien(){
        return gia*sl - giamGia();
    }
    @Override
    public String toString(){
        return ten +" " + ma +" " + stt+ " "+ giamGia()+" "+ThanhTien();
    }
}
public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        MatHang a[] = new MatHang[t];
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            String ma = sc.nextLine();
            int gia = sc.nextInt();
            int sl = sc.nextInt();
            sc.nextLine();
            a[i] = new MatHang(name, ma, gia, sl);
        }
        for(int i=0; i<t; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/