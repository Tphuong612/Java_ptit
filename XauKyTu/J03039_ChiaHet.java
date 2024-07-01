
package XauKyTu;
import java.util.Scanner;
import java.math.BigInteger;
public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger kq = BigInteger.valueOf(0);
            if(a.mod(b) == kq || b.mod(a) == kq) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
