
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PhepToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<BigInteger> arr = new ArrayList<>();
        BigInteger sum = BigInteger.valueOf(0);
        for(int i=0; i<n; i++){
            BigInteger x = sc.nextBigInteger();
            sum = sum.add(x);
            arr.add(x);
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        System.out.println(sum);
    }
}
/*
5
213
2435
653224
34326
6467
*/