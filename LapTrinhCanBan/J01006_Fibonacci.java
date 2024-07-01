/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;

import java.util.Scanner;
public class J01006_Fibonacci {
    public static long[] f = new long[100];
    public static void Fb(){
        f[1] = 1;
        f[2] = 1;
        for(int i=3; i<=92; i++)
            f[i] = f[i-1] + f[i-2];
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        Fb();
        while(t-- >0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
