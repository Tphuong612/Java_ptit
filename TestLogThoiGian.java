
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;


public class TestLogThoiGian {
   public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:\\Hoc Tap\\code\\java\\LogThoiGian.txt"));
        String s = "";
        while(sc.hasNext()){
            String tmp = sc.next();
            s+=tmp+" ";
        }
        s = s.replace(".", " ");
        s = s.replace(",", " ");
        TreeSet<String>ts = new TreeSet<>();//lưu các xâu thời gian thỏa mãn
        DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(s);
        String []a = s.trim().split(" +");
        for(String x: a){
            try{
                LocalDateTime bd = LocalDateTime.parse(x, d);
                ts.add(x);
            } catch (Exception e){
                continue;
            }
        }
        if(ts.isEmpty()) System.out.println("YES");
        for(String x: ts) System.out.println(x);
    } 
}
