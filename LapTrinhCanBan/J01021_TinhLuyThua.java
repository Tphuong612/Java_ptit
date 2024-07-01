/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;
import java.util.Scanner;
public class J01021_TinhLuyThua {
    public static final long m =(long) 1e9 + 7;
    public static long bipow(long a, long b){
        
        if(b==0) return 1;
        long x = bipow(a, b/2)%m;
        if(b%2==0) return (x*x)%m;
        else return (((x*x)%m)*a)%m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0&&b==0) return;
            long k = bipow(a,b);
            System.out.println(k);
        }
    }
}
