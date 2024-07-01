
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class FileNhiPhan {
    public static boolean check(int n){
        if(n<2) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> ts1 = new TreeSet<>();
        for(Integer i: a1){
            if(check(i)) ts1.add(i);
        }
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for(Integer i: a2){
            if(check(i)) ts2.add(i);
        }
        
        for(Integer i: ts1){
            if(i > 500000) break;
            if(ts2.contains(1000000-i)){
                System.out.println(i+""+ (1000000-i));
            }
            
        }
    }
}
