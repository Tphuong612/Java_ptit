
package Mang;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02024_DayConCoTongLe {
    
    public static Integer a[] = new Integer[20];
    public static int b[] = new int[20];
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static void check(int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i]*b[i];
        }
        String kq = "";
        if(sum%2==1){
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(b[i] == 1) res.add(a[i]);
            }
            arr.add(res);        
        }
    }
    public static void Try(int i, int n){
        for(int j=0; j<=1; j++){
            b[i] = j;
            if(i==n-1) check(n);
            else Try(i+1, n);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,0, n, Comparator.reverseOrder());
            Try(0, n);
            
            for(ArrayList<Integer> i: arr){
                for(Integer k: i){
                    System.out.printf(k+" ");
                }
                System.out.println("");
            }
            arr.clear();     
         
        }
    }
}
