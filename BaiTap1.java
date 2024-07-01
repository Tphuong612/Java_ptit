

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class BaiTap1 {
    public static boolean check1(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9') return true;
        }
        return false;
    }
    
    public static boolean check2(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '.') return false;
            if(a.charAt(i) == ',') return false;
            if(a.charAt(i) == '!') return false;
            if(a.charAt(i) == '?') return false;
            if(a.charAt(i) == ':') return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        //ArrayList<String> arr = new ArrayList<>();
        String s = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            s += line + " ";
            if(line.isEmpty()) break;
        }
        
        String word[] = s.trim().split(" +");
        TreeSet<String> ts = new TreeSet<>();
        for(String i: word){
            if(check1(i) && check2(i)) ts.add(i);
        }
        
        for(String i: ts){
            System.out.println(i);
        }
    }

    
}
/*
PTIT duy tri hoc phi nam 2019 va khong tang hoc phi

trong nam 2020, 2021 va 2021 den 2022.

PTIT da trich 6 ty d0ong ho tro moi si1nh vien 500000!
*/
