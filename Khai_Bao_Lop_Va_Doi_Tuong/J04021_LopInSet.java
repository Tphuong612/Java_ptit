
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;
import java.util.TreeSet;
class IntSet{
    private TreeSet<Integer> ts;// dong vai tro nhu 1 bien, 1 phuong thuc
    public IntSet(int[] a){
        this.ts = new TreeSet<>();
        for(int i: a){
            ts.add(i); 
        }
    }
    public IntSet(TreeSet<Integer> a){
        this.ts = a;
    }
    public IntSet union(IntSet a){
        TreeSet<Integer> res = new TreeSet<>();
        res.addAll(this.ts);
        res.addAll(a.ts);
        return new IntSet(res);    
    }
    @Override
    public String toString(){
        String s ="";
        for(int i: ts) s += i +" ";
        return s;
    }
}
public class J04021_LopInSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
