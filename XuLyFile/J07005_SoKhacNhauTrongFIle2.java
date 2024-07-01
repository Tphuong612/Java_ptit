
package XuLyFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFIle2 {
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i=0; i<100000; i++){
            try{
                int a = dis.readInt();
                if(!tm.containsKey(a)) tm.put(a, 1);
                else{
                    tm.put(a, tm.get(a) + 1);
                }    
            } catch(IOException e){
                
            }
        }
        for(Map.Entry<Integer, Integer> i: tm.entrySet()){
            System.out.println(i.getKey()+ " " + i.getValue());
        }
    }
 
}
