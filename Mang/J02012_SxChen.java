/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;
public class J02012_SxChen {
    public static int a[] = new int[105];
    
    public static void solve(int n){
        for(int i = 0; i<n; i++){
            int key = a[i];
            int j = i - 1;
            while(j>=0 &&a[j] > key){
                a[j+1] = a[j]; 
                j--;
            }
            a[j+1] = key; // dua key ve dung vi tri
            System.out.printf("Buoc %d: ", i);
            for(int k=0; k<=i; k++){
                System.out.print(a[k] + " ");
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
