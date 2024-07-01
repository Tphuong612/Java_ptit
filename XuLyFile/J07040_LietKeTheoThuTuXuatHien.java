
package XuLyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        TreeSet<String> ts = new TreeSet<>();
        for(String i: arr){
            String word[] = i.trim().toLowerCase().split(" +");
            ts.addAll(Arrays.asList(word));  
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(ts.contains(s)){
                System.out.println(s);
                ts.remove(s);
            }
        }
    }
}
