
package LapTrinhCanBan;
import java.util.Scanner;
public class J02_TinhTong {
    public static Scanner sc = new Scanner(System.in); // 1 doi tuong static
    public static void testCase(){ // phuong thưc static
        long n = sc.nextLong();
        long s = n*(n+1)/2;
        System.out.println(s);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t!=0){
            testCase();
            t--;
        }
    }
}
