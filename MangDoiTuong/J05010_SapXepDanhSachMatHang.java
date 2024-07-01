/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Arrays;
import java.util.Scanner;
class MatHang implements Comparable<MatHang>{
    private String ma, name, loai;
    private double mua, ban;
    private static int dem = 0;
    public MatHang(String name, String loai, double mua, double ban){
        this.name = name;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.ma = String.format("%d", ++dem);
        
    }
    public double lai(){
        return ban - mua;
    }
    @Override
    public int compareTo(MatHang a){
        return -Double.compare(lai(), a.lai());
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+loai+" "+String.format("%.2f", lai());
    }
}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang a[] = new MatHang[n];
        for(int i = 0; i<n; i++){
            String name = sc.nextLine();
            String loai = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            sc.nextLine();
            a[i] = new MatHang(name, loai, mua, ban);
             
        }
        Arrays.sort(a);
        for(int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/
