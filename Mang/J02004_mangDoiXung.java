
package Mang;
import java.util.Scanner;
import java.util.Arrays;
public class J02004_mangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n+5];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int check = 1;
            for(int i=0; i<n/2; i++){
                if(a[i] != a[n-i-1]){
                    check = 0;
                    break;
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
