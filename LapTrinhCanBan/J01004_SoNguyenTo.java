/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;

import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(long n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(check(n)) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        
    }
}
