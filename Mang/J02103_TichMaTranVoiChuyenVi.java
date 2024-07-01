
package Mang;
import java.util.Scanner;
public class J02103_TichMaTranVoiChuyenVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=1; q<=t; q++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            int kq[][] = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextInt(); 
                    b[j][i] = a[i][j];
                }
            }
            System.out.printf("Test %d:\n",q);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){ 
                    kq[i][j] = 0;
                    for(int k=0; k<m; k++){
                        kq[i][j] += a[i][k] * b[k][j];
                        
                    }
                    System.out.printf("%d ", kq[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }   
}
