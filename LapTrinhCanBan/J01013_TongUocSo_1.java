
package LapTrinhCanBan;

import java.util.Scanner;
public class J01013_TongUocSo_1 {
    public static int n = (int)2e6;
    public static int prime[] = new int[n+5];
    public static void minPrime(){ //// tim uoc nguyen to nho nhat
       for(int i=2; i<=Math.sqrt(n); i++){
           if(prime[i] == 0){//neu so do la snt thi boi cua no se kp la snt
               for(int j = i*i; j<=n; j += i){
                   prime[j] = i;
               }
           }
       }
       // doi voi cac so la snt, thi uoc nguyen to nho nhat la chinh no
       for(int i=2; i<=n; i++){
           if(prime[i]==0){
               prime[i] = i;
           }
       }
    }
    public static long testcase(int b){
        long s = 0;   
        while(b != 1){
            s += prime[b];
            b /= prime[b];
        }
        return s;
    }
    public static void main(String[] args) {
        minPrime();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        for(int i=1; i<=t; i++){
            int a = sc.nextInt();
            sum += testcase(a);
        }
        System.out.println(sum);
    }
}
