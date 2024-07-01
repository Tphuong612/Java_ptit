
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


class LuongMua{
    private String ten, ma;
    private Date bd, kt;
    private int luongmua;
    private int tong=0;
    private double gio = 0;
    public static int dem = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    public void setTong(int luong) {
        this.tong += luong;
    }

    public void setGio(double gio) {
        this.gio += gio;
    }

    public String getTen() {
        return ten;
    }
    public LuongMua(String ten, String bd, String kt, int luongmua) throws ParseException {
        this.ten = ten;
        this.bd = sdf.parse(bd);
        this.kt = sdf.parse(kt);
        this.luongmua = luongmua;
        this.ma = String.format("T%02d", ++dem);
    }
    public double Tbc(){
        return (double) tong/gio;
    }
    public double thoigian(){
        Duration dur = Duration.between(bd.toInstant(), kt.toInstant());
        long phut = dur.toMinutes();
        double gio = phut/60.0;
        return gio;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f",Tbc());              
    }
}
public class J05019_LuongMuaTrungBinh {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<LuongMua> arr = new ArrayList<>();
        ArrayList<String> tram = new ArrayList<>();
        for(int i=0; i<n; i++){
            String ten = sc.nextLine();
            String bd = sc.nextLine();
            String kt = sc.nextLine();
            int luong = sc.nextInt();
            sc.nextLine();
            LuongMua x = new LuongMua(ten, bd, kt, luong);
            if(tram.contains(ten)){
                for(LuongMua j: arr){
                    if(j.getTen().equals(ten)){
                        j.setTong(luong);
                        j.setGio(x.thoigian());
                        break;
                    }
                }
            }
            else{
                tram.add(ten);
                arr.add(x);
                x.setGio(x.thoigian());
                x.setTong(luong);
            }
            
        }
        for(LuongMua i: arr){
            System.out.println(i);
        }
            
        
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/
