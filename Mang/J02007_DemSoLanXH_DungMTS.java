
package Mang;
import java.util.Scanner;
public class J02007_DemSoLanXH_DungMTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1; j<=t; j++){
            
            int n = sc.nextInt();
            int m[] = new int[2000007];
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                m[a[i]]++; //mang tan suat
            }
            System.out.printf("Test %d:\n", j);
            for(int i=0; i<n; i++){
                if(m[a[i]]!=0){
                    System.out.printf("%d xuat hien %d lan\n", a[i], m[a[i]]);
                    m[a[i]] = 0;
                }
            }
        }
    }
}
