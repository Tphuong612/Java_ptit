
package Mang;
import java.util.Scanner;
public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[500];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[a[i]]=1;
        }
        int dem = 0;
        for(int i=1; i<=a[n-1]; i++){
            if(b[i] == 0) {
                dem++;
                System.out.println(i);
            }
        }
        if(dem==0) System.out.println("Excellent!");
    }
      
}
