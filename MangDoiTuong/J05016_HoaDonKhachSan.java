/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class KhachSan implements Comparable<KhachSan>{
    private String ma, ten, phong;
    private Date nhan, tra;
    private int psinh;
    private int tang;
    private static int dem = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public KhachSan(String ten, String phong, String nhan, String tra, int psinh) throws ParseException {
        this.ten = ten.trim();
        this.phong = phong.trim();
        this.nhan = sdf.parse(nhan.trim());
        this.tra = sdf.parse(tra.trim());
        this.psinh = psinh;
        this.ma = String.format("KH%02d", ++dem);
        this.tang = Integer.parseInt(phong.substring(0, 1));
    }
    public int gia(){
        if(tang==1) return 25;
        else if(tang == 2) return 34;
        else if(tang == 3) return 50;
        else if(tang == 4) return 80;
        return 0;     
    }
    
    public long SoNgay(){
        Duration dur = Duration.between(nhan.toInstant(), tra.toInstant());
        long day = dur.toDays() + 1; 
        return day;
    }
    
    public long Tien(){
        return gia()*SoNgay() + psinh;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+phong+" "+SoNgay()+" "+Tien();
    }
    
    @Override
    public int compareTo(KhachSan o){
        return -Long.compare(Tien(), o.Tien());
    }

}
public class J05016_HoaDonKhachSan {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        KhachSan a[] = new KhachSan[n];
        for(int i=0; i<n; i++){
            a[i] = new KhachSan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for(KhachSan i: a){
            System.out.println(i);
        }
    }
}
/*
3
Huynh Van Thanh 
103
05/06/2010 
05/06/2010  
15
Le Duc Cong 
106
08/03/2010  
01/05/2010   
220
Tran Thi Bich Tuyen   
207 
10/04/2010   
21/04/2010   
96
*/
