
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class LogThoiGian {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.isEmpty()) break;
            String word[] = s.split("[ +.,]");
            arr.addAll(Arrays.asList(word));
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        TreeSet<Date> d = new TreeSet<>();
        for(String i: arr){
            try {
                Date a = sdf.parse(i);
                d.add(a);
            } catch (ParseException e) {
                continue;
            }
        }
        
        for(Date i: d){
            String tmp = sdf.format(i);
            System.out.println(tmp);
        }       
    }
}
/*
[BeginLog]
[Boot Session: 2023/01/31
10:22:00.500]
09:50:44.356 WINWORD (0X1X2)
Section 02/09/2023 10:22:16, 538 new
[xxxxxxxx] 10:22:16.569
Start 14:17:50.111over
*/
