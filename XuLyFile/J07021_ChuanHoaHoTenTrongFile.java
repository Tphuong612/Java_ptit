
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J07021_ChuanHoaHoTenTrongFile {
    public static String convert(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String line = sc.nextLine();
            if(line.equals("END")) break;
            String[] word = line.trim().split(" +");
            String kq = "";
            for(int i=0; i<word.length; i++){
                kq += convert(word[i]);
            }
            System.out.println(kq);
        }
        
    }
}
