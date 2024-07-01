/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;

import java.util.Scanner;
public class J01011_GCD {
    public static long gcd (long a, long b){
       if(b==0) return a;
       return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(a*b/gcd(a, b) + " " + gcd(a, b));
        }
    }
}
