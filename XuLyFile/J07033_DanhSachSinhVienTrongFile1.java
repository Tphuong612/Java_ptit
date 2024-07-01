
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String id, name, lop, email;
    public String convert(){
        String word[] = name.trim().toLowerCase().split(" +");
        String kq = "";
        for(int i=0; i<word.length; i++){
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1) kq += " ";
        }
        return kq;
    }
    public SinhVien(String id, String name, String lop, String email){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return id + " " + convert() + " " + lop + " " + email; 
    }
    @Override
    public int compareTo(SinhVien o){
        return id.compareTo(o.getId());
    }
}
public class J07033_DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(n-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(id, name, lop, email);
            arr.add(a);
        }
        Collections.sort(arr);
        for(SinhVien i: arr){
            System.out.println(i);
        }
    }
}

