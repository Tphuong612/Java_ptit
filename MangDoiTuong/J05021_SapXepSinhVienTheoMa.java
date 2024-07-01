
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien implements Comparable<SinhVien>{
    private String name, lop, msv, email;
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " +lop+ " "+email;
    }
    @Override
    public int compareTo(SinhVien a){
        return msv.compareTo(a.msv);
    }
    
}
public class J05021_SapXepSinhVienTheoMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            String msv = sc.nextLine();
            if(msv.isEmpty()) break;
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(msv, ten, lop, email);
            arr.add(a);
        }
        Collections.sort(arr);
        for(SinhVien i: arr){
            System.out.println(i);
        }
    }    
}
