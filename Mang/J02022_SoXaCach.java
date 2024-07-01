
package Mang;
import java.util.Scanner;
public class J02022_SoXaCach {
    public static int n, k;
    public static int a[] = new int[15];
    public static int visited[] = new int[15];
    public static void xuat(){
        for(int i=1; i<=n; i++){
            System.out.printf("%d", a[i]);
        }
        System.out.println("");
    }
    public static boolean check(){
        int ktr = 1;
        for(int i=1; i<=n-1; i++){
            if(Math.abs(a[i]-a[i+1]) == 1){
                ktr = 0;
                break;
            }
        }
        if(ktr == 0) return false;
        return true;
    }
    public static void Try(int i){
        for(int j=1; j<=n; j++){
            if(visited[j] == 0){
                visited[j] = 1;
                a[i] = j;
                if(i==n){
                    if(check()) xuat();
                }
                else{
                    Try(i+1);
                }
                visited[j] = 0;
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            n = sc.nextInt();
            a[0] = 0;
            Try(1);
        }
    }
}
