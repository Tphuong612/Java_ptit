
package UngDungJavaCollections;
import java.util.Arrays;
import java.util.Scanner;


public class J08015_CapSoCoTongBangK {
    public static int begin(long a[], int l, int r, long x){
        int ans = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m] == x){
                ans = m; //cap nhap
                r = m-1; //tim dap an tot hon
            }
            else if(a[m]<x){
                l = m+1;
            }
            else r = m-1;
        }
        return ans;
        
    }
    public static int finish(long a[], int l, int r, long x){
        int ans = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m] == x){
                ans = m; // cap nhap
                l = m+1; // tim dap an tot hon
            }
            else if(a[m] < x) l = m+1;
            else r = m - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            //System.out.println(Arrays.toString(a));
            long dem = 0;
            for(int i=0; i<n-1; i++){
                int p = finish(a, i+1, n-1, k-a[i]);
                int q = begin(a, i+1, n-1, k-a[i]);
                if(p != -1 && q != -1)
                    dem += finish(a, i+1, n-1, k-a[i]) - begin(a, i+1, n-1, k-a[i]) + 1;
            }
            System.out.println(dem);
        }
    }
}
