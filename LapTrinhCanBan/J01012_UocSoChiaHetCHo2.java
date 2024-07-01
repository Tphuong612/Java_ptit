
package LapTrinhCanBan;

import java.util.Scanner;
public class J01012_UocSoChiaHetCHo2 {
    public static boolean check(long n){
        long k = (long) Math.sqrt(n);
        if(k*k==n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long dem=0;
            if(n%2==1) System.out.println(0);
            else{
                
                for(int i=1; i<=Math.sqrt(n); i++){
                   if(n%i==0){
                       if(i%2==0) dem++;
                       if((n/i)%2==0) dem++;
                       
                   } 
                }
                if(check(n)){
                    dem = dem -1;
                }
                System.out.println(dem);
            }
        }
    }
}
