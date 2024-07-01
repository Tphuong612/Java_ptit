
package Mang;
import java.util.Scanner;
public class J02014_DiemCanBang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int f[] = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt(); 
                sum += a[i];
                if(i==0) f[i] = a[i];
                else f[i] = f[i-1] + a[i];
            }
            int check = 0;
            for(int i=1; i<n-1; i++){
                if(f[i-1] == sum - f[i]){
                    System.out.print(i+1+" ");  
                    check = 1;
                }
            }
            
            if(check == 0) System.out.print("-1");
            System.out.println("");
        }
        
    }
}
