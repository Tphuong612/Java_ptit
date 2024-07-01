
package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;


public class J03018_TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;
            for(int i=1; i<=4; i++){
                BigInteger so = BigInteger.valueOf(i).pow(n).mod(BigInteger.valueOf(1000000000));
                sum = sum.add(so);
            }
            BigInteger kq = sum.mod(BigInteger.valueOf(5));
            System.out.println(kq);
        }
    }
}
