
package LapTrinhCanBan;
import java.util.Scanner;
public class J01007_KtrFibonacci {
    public static long f[] = new long[100];
    public static void fb(){
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for(int i=3; i<=92; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
       fb();
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
           long n = sc.nextLong();
           int check = 0;
           for(int i=0; i<=92; i++){
               if(f[i] == n){
                   check = 1;
                   break;
               }
           }
           if(check == 0) System.out.println("NO"); 
           else System.out.println("YES");
       }
    }
}
