
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031_CapSoNguyenToTrongFIle2 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer i: arr){
            if(isPrime(i)) ts.add(i);// n
        }
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        for(Integer j: arr2){
            if(isPrime(j)) ts2.add(j);//m
        }
        
        for(Integer i: ts){
            int j = 1000000-i;
            if(i>j) break;
            if(ts.contains(j) && !ts2.contains(j) && !ts2.contains(i)){
                System.out.println(i + " " + j);
            }
        }
        
    }    
}
