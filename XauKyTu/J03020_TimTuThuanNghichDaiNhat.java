/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class J03020_TimTuThuanNghichDaiNhat {
    public static boolean tn(String a) {
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            s += line +" ";
            if(line.isEmpty()) break;
        }
        String word[] = s.trim().split(" +");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        for(String i: word){
            if(tn(i)){
                if(lhm.containsKey(i)) lhm.put(i, lhm.get(i) + 1);
                else lhm.put(i, 1);
            }
        }
        int max = 0;
        for(String i: lhm.keySet()){
            if(i.length() > max) max = i.length();
        }
        
        for(Map.Entry<String, Integer> i: lhm.entrySet()){
            if(i.getKey().length() == max) System.out.println(i.getKey() + " " + i.getValue());
        }
                
    }
}
