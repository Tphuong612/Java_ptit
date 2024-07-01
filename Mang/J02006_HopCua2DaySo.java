/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.Scanner;
public class J02006_HopCua2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[] = new int[1005];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            a[x]=1; // so lan xuat hien cua ptu mang gtr x;
        } 
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            a[x]=1; // so lan xuat hien cua ptu mang gtr x;
        } 
        
        for(int i=0; i<1005; i++){
            if(a[i]==1){ // ca 2 ptu o mang a va b deu mang gtr i, nen chung tat nhien se bang nha
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
