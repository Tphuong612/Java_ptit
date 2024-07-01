/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;
import java.util.Arrays;
import java.util.Scanner;

class XangDau2 implements Comparable<XangDau2>{
    private String ma;
    private long sl;
    public XangDau2(String ma, long sl){
        this.ma = ma;
        this.sl = sl;
    }
    public String hangsx(){
        String s = ma.substring(ma.length()-2);
        if(s.equals("BP")) return "British Petro";
        else if(s.equals("ES")) return "Esso";
        else if(s.equals("SH")) return "Shell";
        else if(s.equals("CA")) return "Castrol";
        else if(s.equals("MO")) return "Mobil";
        return "Trong Nuoc";
        
    }
    public long dongia(){
        char s = ma.charAt(0);
        if(s == 'X') return 128000;
        else if(s == 'D') return 11200;
        return 9700;
    }
    public long Tien(){
        return dongia()*sl;
    }
    public long thue(){
        char s = ma.charAt(0);
        String hang = ma.substring(ma.length() - 2);
        if(hang.equals("TN")) return 0;
       
        if(s == 'X') return (long) (128000*sl*0.03);
        else if(s == 'D') return (long) (11200*sl*0.035);
        else if(s == 'N') return (long) (9700*sl*0.02);

        return 0;
    }
    public long thanhtien(){
        return (Tien() + thue());
    }
    @Override
    public String toString(){
        return ma+" "+hangsx()+" "+dongia()+" "+thue()+" "+thanhtien();
    }
    @Override
    public int compareTo(XangDau2 o){
        return -Long.compare(thanhtien(), o.thanhtien());
    }
}
public class J05068_SapXepBangGiaXangDau {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        XangDau2 a[] = new XangDau2[n];
        for(int i=0; i<n; i++){
            String ten = sc.next();
            long sl = sc.nextLong();
            a[i] = new XangDau2(ten, sl);
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    } 
}
/*
4
N89BP 4500
D00BP 3500
X92SH 2600
X90TN 4500
*/
