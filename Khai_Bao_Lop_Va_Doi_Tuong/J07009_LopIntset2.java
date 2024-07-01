
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
class IntSet{
    private TreeSet<Integer> ts = new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int a[]) {
        for(int i: a){
            this.ts.add(i);
        }
    }
    public IntSet intersection(IntSet s2){
        IntSet a = new IntSet();
        for(int i: ts){
            if(s2.ts.contains(i)) a.ts.add(i);
        }
        return a;
    }
    @Override
    public String toString(){
        String kq ="";
        for(int i: ts){
            kq += i + " ";
        }
        return kq;
    }

}
public class J07009_LopIntset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
