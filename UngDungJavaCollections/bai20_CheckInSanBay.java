package UngDungJavaCollections;

import java.util.Arrays;
import java.util.Scanner;

class Khach implements Comparable<Khach>{
    public int den, during;
    public Khach(int den, int during){
        this.den = den;
        this.during = during;
    }
    
    @Override
    public int compareTo(Khach o){
        return Integer.compare(den, o.den);
    }  
}

public class bai20_CheckInSanBay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Khach a[] = new Khach[n];
        for(int i = 0; i<n; i++){
            a[i] = new Khach(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
       // long sum = a[1].den + a[1].during;
        long sum = 0;
        for(int i=0; i<n; i++){
            if(sum<a[i].den){
                sum = a[i].den + a[i].during;
            }
            else sum += a[i].during;
        }
        System.out.println(sum);
    }
}
