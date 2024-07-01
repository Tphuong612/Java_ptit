
package MangDoiTuong;
import java.util.Arrays;
import java.util.Scanner;

class ThucTap implements Comparable<ThucTap>{
    private String ma, ten, lop, email, dn;// dn = doanh nghiep
    private String stt;
    private static int dem = 0;
    public ThucTap(String ma, String ten, String lop, String email, String dn){
        this.stt = String.format("%d", ++dem);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String getDn(){
        return dn;
    }
    @Override
    public String toString(){
        return stt+" "+ma+" "+ten+" "+ lop+" "+ email+" "+dn;
    }
    @Override
    public int compareTo(ThucTap a){
        return ma.compareTo(a.ma);
    }
}
public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThucTap a[] = new ThucTap[n];
        for(int i=0; i<n; i++){
            a[i] = new ThucTap(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            for(ThucTap i: a){
                if(i.getDn().equals(s)) System.out.println(i);
            }
        }
        
    }
       
}
