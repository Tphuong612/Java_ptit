
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.IOException;

class WordSet{
    private TreeSet<String> ts = new TreeSet<>();

    public WordSet() {
    }
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            String word[] = s.trim().split(" +");
            this.ts.addAll(Arrays.asList(word));
        }
    }
    
    public WordSet difference(WordSet s){
        WordSet tru = new WordSet();
        for(String i: ts){
            if(!s.ts.contains(i)) tru.ts.add(i);
        }
        return tru;
    }
    @Override
    public String toString(){
        String kq ="";
        for(String i: ts){
            kq += i+" ";
        }
        return kq.trim();
    }
}
public class J07024_HieuCuaHaiTapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
