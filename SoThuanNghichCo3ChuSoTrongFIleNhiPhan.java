

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;


public class SoThuanNghichCo3ChuSoTrongFIleNhiPhan {
    public static boolean ThuanNghich(String a){
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)) return false;
        }
        return true;
    }
    public static boolean check(int a){
        String s = String.valueOf(a);
        if(s.length() < 3) return false;
        else{
            if(ThuanNghich(s)) return true;
            else return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer i: arr){
            if(check(i)) ts.add(i);
        }
        for(Integer x: ts){
            System.out.println(x);
        }
    }
}
