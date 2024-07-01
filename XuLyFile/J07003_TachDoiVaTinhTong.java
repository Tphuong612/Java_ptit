
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.*;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while(s.length() != 1){
            int n = s.length();
            BigInteger a = new BigInteger(s.substring(0, (int) floor(n/2)));
            BigInteger b = new BigInteger(s.substring((int) ceil(n/2)));
            BigInteger kq = a.add(b);
            s = kq.toString(); 
            System.out.println(s);
        }
        
    }
}
