
package Mang;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;


public class J02016_BoBaSoPytago {
    public static boolean BinarySearch(int a[], int l, int r, double x){
        while(l<=r){
            int m = (l+r)/2;
            if(a[m] == x) return true;
            else if(a[m]<x) l=m+1;
            else r = m-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int check = 0;
            for(int i = 0; i<n; i++){
                for(int j = i+1; j<n; j++){
                    if(BinarySearch(a, j+1, n-1, sqrt(pow(a[i],2)+pow(a[j],2)))){
                        check = 1;
                        System.out.println("YES");
                        break;
                    }
                }
                if(check == 1) break;
            }
            if(check == 0) System.out.println("NO");
        }
    }
}