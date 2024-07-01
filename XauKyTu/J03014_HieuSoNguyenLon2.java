
package XauKyTu;
import java.util.Scanner;
import java.math.BigInteger;
public class J03014_HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger kq = a.subtract(b);
            System.out.println(kq);
        }
    }
}
