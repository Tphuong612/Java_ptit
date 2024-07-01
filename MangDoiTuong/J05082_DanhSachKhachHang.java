
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class KhachHang2 implements Comparable<KhachHang2>{
    private String ma, ten, gt, dc;
    private Date dob;
    private static int dem = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public String chuanHoa(String s){
        String word[] = s.trim().split(" +");
        String kq =" ";
        for(String i: word){
            kq += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return kq.trim();
    }
    public KhachHang2(String ten, String gt, String dob, String dc) throws ParseException {
        this.ma = String.format("KH%03d", ++dem);
        this.ten = chuanHoa(ten);
        this.gt = gt;
        this.dob = sdf.parse(dob);
        this.dc = dc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " "+ gt+" "+ dc +" "+ sdf.format(dob); 
    }
    @Override
    public int compareTo(KhachHang2 o){
        return dob.compareTo(o.dob);
    }
    
}
public class J05082_DanhSachKhachHang {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang2 a[] = new KhachHang2[n];
        for(int i=0; i<n; i++){
            a[i] = new KhachHang2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(KhachHang2 i: a){
            System.out.println(i);
        }
        
    }
}
/*
3
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
 TRan    vAn     biNh
Nam
2/8/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/
