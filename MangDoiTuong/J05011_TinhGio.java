
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
 
class Game implements Comparable<Game>{
    private String name, ma;
    private Date vao, ra;
    private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    public Game(String ma, String name, String vao, String ra) throws ParseException{
        this.ma = ma;
        this.name = name;
        this.vao = sdf.parse(vao);
        this.ra = sdf.parse(ra);
    }
    public long duration(){
        Duration dur = Duration.between(vao.toInstant(), ra.toInstant());
        return dur.toMinutes();
    }
    @Override
    public String toString(){
        int gio = (int) (duration()/60);
        int phut = (int) (duration()%60);
        return ma+" "+name+" "+ String.format("%d gio", gio) +" " + String.format("%d phut", phut);
    }
    @Override
    public int compareTo(Game a){
        return -Long.compare(duration(), a.duration()); 
    }

}
public class J05011_TinhGio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Game a[] = new Game[n];
        for(int i=0; i<n; i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            a[i] = new Game(ma, name, vao, ra);
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/
