
package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger chia = BigInteger.valueOf(11);
            if(a.mod(chia) == BigInteger.valueOf(0)) System.out.println(1);
            else System.out.println(0);
        }
             
    }
}
