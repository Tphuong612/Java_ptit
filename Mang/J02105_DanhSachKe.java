/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.Scanner;
public class J02105_DanhSachKe {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        byte a[][] = new byte[n][n];
      
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextByte(); 
                
            }
        }
       
        for(int i=0; i<n; i++){
            System.out.printf("List(%d) = ", i+1);    
            for(int j=0; j<n; j++){
                if(a[i][j]==1) System.out.printf("%d ", j+1);
            }
            System.out.println("");
                                   
        }        
    }    
}
