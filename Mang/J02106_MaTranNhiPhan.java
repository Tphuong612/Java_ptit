
package Mang;
import java.util.Scanner;
public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int dem = 0;        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextByte();
                sum += a[i][j];
            }
            
            if(sum >= 2) dem++;
        }
        System.out.println(dem);
    }
}
