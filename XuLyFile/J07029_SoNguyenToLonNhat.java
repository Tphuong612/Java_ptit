
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;


import java.util.TreeMap;

public class J07029_SoNguyenToLonNhat {
    public static boolean nt(int n){
        if (n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        
//        ArrayList<Integer> arr = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            int x = sc.nextInt();
//            arr.add(x);
//        }
//        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i: arr){
            if(nt(i)){
                if(!tm.containsKey(i)) tm.put(i, 1);
                else tm.put(i, tm.get(i)+1);
            }
        }
        //dua Map vao 1 ArrayList roi sap xep tang dan;
        ArrayList<Map.Entry<Integer, Integer>> arr2 = new ArrayList<>(tm.entrySet());
        Collections.sort(arr2, 
                (Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) 
                        -> entry2.getKey().compareTo(entry1.getKey()));
        int dem = 0;
        for(Map.Entry<Integer, Integer> i: arr2){
            dem++;
            System.out.println(i.getKey()+" "+i.getValue());
            if(dem==10) break;
        }
        
    }
}
