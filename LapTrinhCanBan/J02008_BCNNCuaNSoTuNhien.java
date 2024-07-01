
package LapTrinhCanBan;
import java.util.Scanner;
public class J02008_BCNNCuaNSoTuNhien {
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public static long BCNN(long a, long b){
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long kq = 1;
            for(int i=1; i<=n; i++){
                kq = BCNN(kq, i);
            }
            System.out.println(kq);
        }
    }
   
}
