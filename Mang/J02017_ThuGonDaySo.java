
package Mang;
import java.util.Scanner;

import java.util.ArrayList;
public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(al.isEmpty()) al.add(a[i]);
            else{
                if((al.get(al.size()-1) + a[i])%2==1) al.add(a[i]);
                else al.remove(al.size()-1);
            }
        }
        System.out.println(al.size());
    }
}
