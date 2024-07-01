
package MangDoiTuong;

import java.util.Scanner;
class NhanVien{
    private String ma, hoTen, sex, dob, add, Idtax, hopDong;
    private static int dem = 1; 
    public NhanVien(String hoTen, String sex, String dob, String add, String Idtax, String hopDong){
        this.ma = String.format("%05d", dem++);
        this.hoTen = hoTen;
        this.dob = dob;
        this.add = add;
        this.Idtax = Idtax;
        this.hopDong = hopDong;
        this.sex = sex;     
    }
    
    
    @Override
    public String toString(){
        return ma +" "+hoTen+" "+sex+" "+dob+" "+add+" "+Idtax+" "+hopDong;
    }
}
public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien a[] = new NhanVien[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String add = sc.nextLine();
            String Idtax = sc.nextLine();
            String hop = sc.nextLine();
            a[i] = new NhanVien(ten, sex, dob, add, Idtax, hop);
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
            
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/
