
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class Matrix{
    private int n, m;
    private int a[][] = new int[1001][1001];

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        Matrix cv = new Matrix(this.m, this.n);
        
        for(int i=0; i<this.n; i++){
            for(int j=0; j<this.m; j++){
                cv.a[j][i] = this.a[i][j];
            }
        }
        return cv;
    }
    public Matrix mul(Matrix o){
        Matrix tich = new Matrix(n, o.m);
        for(int i=0; i<n; i++){
            for(int j=0; j<o.m; j++){
                int sum = 0;
                for(int k=0; k<m; k++){
                    sum += a[i][k] * o.a[k][j];
                }
                tich.a[i][j] = sum;
            }
            
        }
        return tich;
    }
    @Override
    public String toString(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.printf(a[i][j]+" ");
            }
            System.out.println("");
        }
        return "";
    }
    
}
public class J04017_TichMaTranVaChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
/*
1
2  2
1  2
3  4
*/