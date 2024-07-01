/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;

import java.util.Scanner;
public class J01018_SoKhongLienKe {
    public static boolean check1(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        if(sum%10==0) return true;
        else return false;
    }
    public static boolean check2(String s){
        int ktr = 1;
        for(int i=0; i<s.length()-1; i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1)) != 2){
                ktr = 0;
                break;
            }         
        }
        if(ktr == 1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
 
}
