
package Mang;
import java.util.Scanner;
public class J02021_LietKeToHop2 {
    public static int n, k, dem = 0;
    public static int a[] = new int[15];
    public static void xuat(){
        dem++;
        for(int i=1; i<=k; i++){
            System.out.printf("%d", a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i){
        for(int j = a[i-1]+1; j<=n+k-i; j++){
            a[i] = j;
            if(i==k) xuat();
            else Try(i+1);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a[0] = 0;
        Try(1);
        System.out.printf("\nTong cong co %d to hop", dem);
        System.out.println("");
    }
}

