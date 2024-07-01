
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class J07023_NguyenToVaThuanNghich {
    public static boolean snt(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean tn(int n){
        String s = String.valueOf(n);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois1.readObject();
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        for(Integer i: arr){
            if(tn(i) && snt(i)){
                if(!tm1.containsKey(i)) tm1.put(i, 1);
                else tm1.put(i, tm1.get(i) + 1);
            }
        }
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        for(Integer i: arr2){
            if(tn(i) && snt(i)){
                if(!tm2.containsKey(i)) tm2.put(i, 1);
                else tm2.put(i, tm2.get(i) + 1);
            }
        }
        
        TreeMap<Integer, Integer> giao = new TreeMap<>();
        for(Map.Entry<Integer, Integer> i: tm1.entrySet()){
            if(tm1.containsKey(i.getKey())){
                System.out.println(i.getKey()+" "+tm1.get(i.getKey())+" "+tm2.get(i.getKey()));
            }
        }   
    }
}
