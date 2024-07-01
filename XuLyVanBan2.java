
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Character.isDigit;

import java.util.Scanner;
import java.util.TreeSet;


public class XuLyVanBan2 {
    public static boolean chuSo(String a){
        for(int i=0; i<a.length(); i++){
            if(isDigit(a.charAt(i))) return true;
        }
        return false;
    }
    public static boolean dau(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='.' ||a.charAt(i)==',' ||a.charAt(i)==':' ||a.charAt(i)=='!' || a.charAt(i)=='?') return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String word[] = s.trim().split(" +");
            for(String i: word){
                if(chuSo(i) && dau(i)) ts.add(i);
            }
        }
        for(String i: ts){
            System.out.println(i);
        }
        
    }
}
