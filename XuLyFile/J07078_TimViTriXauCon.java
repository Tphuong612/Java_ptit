/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet<Integer> ts = new TreeSet<>();
            for(int i=0; i<s1.length(); i += s2.length()){
                int vtr = s1.indexOf(s2, i);
                if(i==0 && vtr ==0) ts.add(vtr+1);
                if(i !=0 && vtr != -1) ts.add(vtr+1);
            }
            for(int i: ts){
                System.out.print(i +" ");
            }
            System.out.println("");
        }
    }
}
