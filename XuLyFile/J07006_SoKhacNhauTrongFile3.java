
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arl = (ArrayList<Integer>) ois.readObject(); //ArrayList<Integer> dc coi la 1 doi tuong
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i: arl){
            if(!tm.containsKey(i)) tm.put(i, 1);
            else tm.put(i, tm.get(i) + 1);
        }
        for(Map.Entry<Integer, Integer> i: tm.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        
    }
}
