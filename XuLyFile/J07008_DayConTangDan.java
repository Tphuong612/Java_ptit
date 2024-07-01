
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07008_DayConTangDan {
    public static ArrayList<String> ar = new ArrayList<>();
    public static int n;
    public static int a[] = new int[30];// chua xau nhi phan
    public static int b[] = new int[30];// chua mang de bai
    public static void toHop(){
        ArrayList<Integer> ar2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i] != 0) ar2.add(a[i]*b[i]);
        }
        if(ar2.size()<2) return;
        int check = 1;
        for(int i=0; i<ar2.size()-1; i++){
           if(ar2.get(i) > ar2.get(i+1)) check = 0;
        }
        if(check == 1){
            String kq = "";
            for(int i=0; i<ar2.size(); i++){
                kq += String.valueOf(ar2.get(i)) + " ";
            }
            ar.add(kq);
        }
    }

    public static void Try(int i){
        for(int j=0; j<=1; j++){
            a[i] = j;
            if(i==n-1) toHop();
            else Try(i+1);
        }
    }
    public static void xuat(){
        ar.sort(Comparator.naturalOrder());
        for(String i: ar){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            b[i] = Integer.parseInt(sc.next());
        }  
        Try(0);
        xuat();
    }
}
