package Mang;
import java.util.Scanner;
public class J02013_SxNoiBot {
    public static int a[] = new int[105];
    public static int check(int n){
        for(int i=0; i<n-1; i++){
            if(a[i+1] <a[i]) return 0;
        }
        return 1;
    }
    public static void solve(int n){
        for(int i = 0; i<n-1; i++){
            
            for(int j = 0; j<n-1-i; j++){
                if(a[j] > a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
            
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0; j<n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
            if(check(n) == 1) return;
        }
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();            
        }
        solve(n);
    }
}
