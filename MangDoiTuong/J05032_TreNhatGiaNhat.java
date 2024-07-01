
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private Date dob;
    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Nguoi(String ten, String dob) throws ParseException{
        this.ten = ten;
        this.dob = sdf.parse(dob);
    }
    public String getTen(){
        return ten;
    }
    @Override
    public int compareTo(Nguoi a){
        return -dob.compareTo(a.dob);
    }
}
public class J05032_TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Nguoi a[] = new Nguoi[n];
        for(int i=0; i<n; i++){
            a[i] = new Nguoi(sc.next(), sc.next());
        }
        Arrays.sort(a);
        System.out.println(a[0].getTen());
        System.out.println(a[n-1].getTen());
    }
    
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/
