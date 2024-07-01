/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.nextLine());
            String charr[] = sc.nextLine().trim().split(" +");
            Arrays.sort(charr);
            String s1="", s2="";
            for(int i=0; i<n; i++){
                if(i%2==0) s1 += charr[i];
                else s2 += charr[i];
            }
            long kq = Long.parseLong(s1) + Long.parseLong(s2);
            System.out.println(kq);
        }
    }
 
}
