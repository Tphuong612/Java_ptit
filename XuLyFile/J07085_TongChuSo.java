
package XuLyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Character.isDigit;
import java.math.BigInteger;
import java.util.ArrayList;


public class J07085_TongChuSo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        for(String i: arr){
            String kq = "";
            int sum = 0;
            for(int j = 0; j<i.length(); j++){
                if(isDigit(i.charAt(j))){
                    kq += i.charAt(j);
                    sum += i.charAt(j) - '0';
                }
            }
            BigInteger a = new BigInteger(kq); 
            System.out.println(a +" "+ sum);
            
        }
        
    }
}
