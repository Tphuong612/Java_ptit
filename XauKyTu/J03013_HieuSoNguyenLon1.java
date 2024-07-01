
package XauKyTu;
import java.util.Scanner;
import java.math.BigInteger;
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger kq = a.subtract(b).abs();
            String a1 = a.toString();
            String b1 = b.toString();
            String kq1 = kq.toString();
            int check;
            if(a1.length() >= b1.length()) check = a1.length();
            else check = b1.length();
            String m = "";
            if(kq1.length() < check){
                for(int i=1; i<=check-kq1.length(); i++) m += "0";
            }
            kq1 = m + kq;
            System.out.println(kq1);
        }
    }  
}
