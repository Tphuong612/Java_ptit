
package XauKyTu;
import java.util.Scanner;
import java.math.BigInteger;
public class J03011_UCLNSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger UCLN = a.gcd(b);
            System.out.println(UCLN);
            
        }
    }
         
}
