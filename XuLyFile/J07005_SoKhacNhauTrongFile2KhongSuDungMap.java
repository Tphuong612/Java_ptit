
package XuLyFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005_SoKhacNhauTrongFile2KhongSuDungMap {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1005];
        for(int i=0; i<100000; i++){
            a[dis.readInt()]++;
        }
        for(int i=0; i<a.length; i++){
            if(a[i] != 0) System.out.println(i + " " + a[i]);
        }
    }
}
