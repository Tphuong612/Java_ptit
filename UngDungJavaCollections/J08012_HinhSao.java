
package UngDungJavaCollections;

import java.util.Arrays;
import java.util.Scanner;

public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int degree[] = new int[n+1];
        for(int i = 1; i<=n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            degree[x]++;
            degree[y]++;
        }
        Arrays.sort(degree);
        if(degree[n]== n-1) System.out.println("Yes");
        else System.out.println("No");
    }
}
