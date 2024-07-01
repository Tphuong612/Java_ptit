
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Online implements Comparable<Online>{
    private String name;
    private Date start, finish;
    private long lt;
    
    public Online(String name, String start, String finish) throws ParseException{
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.start = sdf.parse(start);
        this.finish = sdf.parse(finish);
        this.lt = Math.abs(this.finish.getTime() - this.start.getTime());
    }
    @Override
    public String toString(){
        return name + " " + (long)lt/(1000*60);
    }
    @Override
    public int compareTo(Online o){
        if(lt != o.lt) return -Long.compare(lt, o.lt);
        return name.compareTo(o.name);
    }
}
public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in."));
        int n = Integer.parseInt(sc.nextLine());
        Online a[] = new Online[n];
        for(int i=0; i<n; i++){
            a[i] = new Online(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(Online i: a){
            System.out.println(i);
        }
    }
}
