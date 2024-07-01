/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XauConLapDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            Map<Character, Integer> m = new HashMap<>();
            for(int i = 0; i<n; i++){
                if(!m.containsKey(s.charAt(i))) m.put(s.charAt(i), 1);
                else m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            }   
                    // Chuyển Map thành một danh sách các cặp key-value
            ArrayList<Map.Entry<Character, Integer>> al = new ArrayList<>(m.entrySet());

            // Sắp xếp danh sách các cặp key-value bằng Comparator theo giá trị giảm dần
            Collections.sort(al, new Comparator<Map.Entry<Character, Integer>>(){
                @Override
                public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                    // Sắp xếp theo giá trị (value) giảm dần
                    return (entry2.getValue() - entry1.getValue());
                }
            });
            for(Map.Entry<Character, Integer> i : al){
                System.out.println(i.getValue() - 1);
                break;
            }
        }   
    }  
}







