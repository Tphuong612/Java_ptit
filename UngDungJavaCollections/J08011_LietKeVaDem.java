
package UngDungJavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class J08011_LietKeVaDem {
    public static boolean KhongGiam(String s){
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)>s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.isEmpty()) break;
            String word[] = s.trim().split(" +");
            for(String i: word){
                if(KhongGiam(i)){
                    if(lhm.containsKey(i)) lhm.put(i, lhm.get(i)+1);
                    else lhm.put(i, 1);
                }
            }
            
        }
        
        List<Map.Entry<String, Integer>> ls = new ArrayList<>(lhm.entrySet()); // chuyen Map sang dang List;
        Collections.sort(ls, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
                return -Integer.compare(a.getValue(), b.getValue());
            }
        });
        for(Map.Entry<String, Integer> i: ls){
            System.out.println(i.getKey()+" "+i.getValue());
        }
        
    }
}
/*
123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134
*/