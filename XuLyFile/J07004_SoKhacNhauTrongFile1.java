
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        while(sc.hasNext()){
            try{
                String s = sc.next();
                int a = Integer.parseInt(s);
                if(!tm.containsKey(a)) tm.put(a, 1);
                else{
                    tm.put(a, tm.get(a) + 1);
                }    
            }catch(Exception e){  
            }
        }
        for(Map.Entry<Integer, Integer> i: tm.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
                
    }
}
