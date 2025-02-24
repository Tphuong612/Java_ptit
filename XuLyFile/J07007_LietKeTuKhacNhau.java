/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet{
    private Set<String> set;
    public WordSet(String FileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<String>();
        while(sc.hasNext()){
            String s = sc.next();
            set.add(s.toLowerCase());
        }
    }
    @Override
    public String toString(){
        String kq = "";
        for(String i: set){
            kq += i + '\n';
        }
        return kq;
    }
}
public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
