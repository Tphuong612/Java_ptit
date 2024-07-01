/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean check(int a){
        if(a<2) return false;
        for(int i=2; i<=sqrt(a); i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arl = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i: arl){
            if(check(i)){
                if(!tm.containsKey(i)) tm.put(i, 1);
                else tm.put(i, tm.get(i)+1);                
            }
        }
        for(Map.Entry<Integer, Integer> i: tm.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
   
    }
}
