/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien>{
    private String ma, name, sex, add, tax;
    private Date dob, hd;
    private static int dem = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public NhanVien(String name,String sex, String dob, String add, String tax, String hd) throws ParseException{
        this.name = name;
        this.sex = sex;
        this.dob = sdf.parse(dob);
        this.add = add;
        this.tax = tax;
        this.hd = sdf.parse(hd);  
        this.ma = String.format("%05d", dem++);
    }
    @Override
    public String toString(){
        return ma +' '+name+" "+ sex+" "+sdf.format(dob)+" "+add+" "+tax+" "+sdf.format(hd);
    }
    @Override
    public int compareTo(NhanVien a){
        return dob.compareTo(a.dob);
    }
}
public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien a[] = new NhanVien[n];
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String add = sc.nextLine();
            String tax = sc.nextLine();
            String hd = sc.nextLine();
            a[i] = new NhanVien(name, sex, dob, add, tax, hd);
        }
        Arrays.sort(a);
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

