
package Mang;


import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02026_DayConCoKPhanTuTangDan{
    
    public static int a[] = new int[20];// chua mang ban dau
    public static int b[] = new int[20];// chua to hop sinh ra
    public static int c[] = new int[20];// chua mang in ra
    public static void xuat(int k, int n){
        for(int i=1; i<=k; i++){
            System.out.printf(c[i] +" ");
        }
        System.out.println("");
    }
    public static void Try(int i, int n, int k){
        for(int j=b[i-1]+1; j<=n-k+i; j++){
            b[i] = j;
            c[i] = a[b[i]];
            if(i==k) xuat(k, n);
            else Try(i+1, n, k);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n+1);
            b[0] = 0;
            Try(1, n, k);
 
        }
    }
}
