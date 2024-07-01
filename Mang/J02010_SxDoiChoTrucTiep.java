/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.Scanner;
public class J02010_SxDoiChoTrucTiep {
    public static int a[] = new int[105];
    public static void solve(int n){
        for(int i = 0; i<n-1; i++){
            
            for(int j = i+1; j<n; j++){
                if(a[i] > a[j]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
             
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0; j<n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
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
