

package danhsachsinhvien1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class SinhVien{
    private String ma, lop, ten;
    private Date ngs;
    private float gpa;
    private static int dem = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public SinhVien(String ma, String lop, String dob, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", ++dem);
        this.ten = ten;
        this.lop = lop;
        this.ngs = sdf.parse(dob);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma +" "+ten+" "+lop+" "+sdf.format(ngs)+" "+String.format("%.2f", gpa);
    }
    
    
}
public class J07013_DanhSachSinhVienTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien i: arr){
            System.out.println(i);
        }
        
    }
}
