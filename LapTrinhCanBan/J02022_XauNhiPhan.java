
package LapTrinhCanBan;
import java.util.Scanner;
public class J02022_XauNhiPhan {
    public static long f[] = new long[100];
    public static void fb(){
        f[1] = 1;
        f[2] = 1;
        for(int i=3; i<100; i++) 
            f[i] = f[i-2] + f[i-1];
    }
    
    public static char solve(int n, long k){ // tim vi tri k trong xau thu n la ki tu nao
        if(n == 1) return '0';
        else if(n == 2) return '1';
        
        if(k<=f[n-2]) return solve(n-2, k);
        else if(k>f[n-2]) return solve(n-1, k-f[n-2]);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fb();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
          
            char a = solve(n, k); 
            System.out.println(a);
        }
    }
}
