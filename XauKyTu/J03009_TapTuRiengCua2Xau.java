
package XauKyTu;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class J03009_TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine().trim();//nhap xau s1, s2
            String b = sc.nextLine().trim();
            
            String s1[] = a.split(" +");
            String s2[] = b.split(" +");
            
            TreeSet<String> st2 = new TreeSet<>();
            st2.addAll(Arrays.asList(s2)); // dua vao trong set de kiem tra
            
            TreeSet<String> kq = new TreeSet<>();
            for(String i: s1){
                if(!st2.contains(i)) kq.add(i);
            }
            
            for(String i: kq){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
    }
}
