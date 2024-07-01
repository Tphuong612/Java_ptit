
package MangDoiTuong;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private float gpa;
    private String dob, lop, name;
    private String msv;
    private static int dem = 1;
    public SinhVien() throws ParseException{
        this("", "", "", 0);
    }
    public SinhVien(String name, String lop, String dob, float gpa) throws ParseException{
        this.msv = String.format("B20DCCN%03d", dem++);
        this.name = convert(name);
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dob);
        this.dob = sdf.format(date);
        this.gpa = gpa;
    }
    public final String convert(String ten){
        String word[] = ten.trim().toLowerCase().split(" +");
        String kq = "";
        for (int i=0; i<word.length; i++) {
            kq += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1){
                kq += " ";
            }
        }
        return kq;
    }
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
public class J05004_DanhSachDoiTuongSinhVien2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien a[] = new SinhVien[n];
        sc.nextLine();
        for(int i= 0; i< n; i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = sc.nextFloat();
            sc.nextLine();
            a[i] = new SinhVien(name, lop, dob, gpa);
        }
        for(SinhVien i: a){
            System.out.println(i);
        }
    }    
}
/*
1
nGuyEn  vaN    biNH
D20CQCN01-B
2/12/2002
3.1
*/