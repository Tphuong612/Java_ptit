
package Mang;
import java.util.Scanner;
import java.util.Arrays;
public class J02005_GiaoCua2DaySo_TinhCaPtuTrung{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int j=0; j<m; j++) b[j] = sc.nextInt();
        Arrays.sort(a); //sx mang
        Arrays.sort(b);
        
        int i=0, j=0;
        while(i<n && j<m){
            if(a[i] == b[j]){
                System.out.print(b[j] + " ");
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
    }
}
