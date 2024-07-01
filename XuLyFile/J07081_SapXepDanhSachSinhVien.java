
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String ten, ho, dem, fullname;
    private String sdt, email, ma;
    public SinhVien(String ma, String name, String sdt, String email){
        this.ma = ma;
        String word[] = name.trim().toLowerCase().split(" +");
        this.ten = word[word.length - 1];
        this.ho = word[0];
        if(word.length > 2){
            String kq = "";
            for(int i=1; i<word.length - 1; i++){
                kq += word[i];
            }
            this.dem = kq;
        }
        String tmp = "";
        for (int i=0; i<word.length; i++) {
            tmp += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1){
                tmp += " ";
            }
        }
        this.fullname = tmp; 
        this.sdt = sdt;
        this.email = email;
    }
    @Override
    public String toString(){
        return ma+" "+fullname+" "+sdt+" "+email;
    }
    @Override
    public int compareTo(SinhVien o){
        if(!ten.equals(o.ten)) return ten.compareTo(o.ten);
        else if(!ho.equals(o.ho)) return ho.compareTo(o.ho);
        else if(!dem.equals(o.dem)) return dem.compareTo(o.dem);
        return ma.compareTo(o.ma);
    }
}
public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(n-- >0){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a);
        }
        Collections.sort(arr);
        for(SinhVien i: arr){
            System.out.println(i);
        }
        
    }
}
