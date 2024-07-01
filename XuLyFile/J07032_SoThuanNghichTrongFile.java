
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class J07032_SoThuanNghichTrongFile {
    public static boolean isTN(int n) {
        String s = String.valueOf(n);
        if(s.length()%2==0 || s.length()==1) return false;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) - '0')%2==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> s1 = new TreeSet<>(a);
        TreeSet<Integer> s2 = new TreeSet<>(b);
        ArrayList<Integer> num = new ArrayList<>();
        for (int i : s1)
        {
            if (s2.contains(i) && isTN(i))
                num.add(i);
            if (num.size() == 10)
                break;
        }
        for (int i : num)
            System.out.println(i + " " + (Collections.frequency(a, i) + Collections.frequency(b, i)));
    }
        
        
        
}
    
