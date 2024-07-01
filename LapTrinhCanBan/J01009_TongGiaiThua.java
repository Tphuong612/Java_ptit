
package LapTrinhCanBan;
import java.util.Scanner;
public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        long tich=1;
        for(int i=2; i<=n; i++){
            tich *= i;
            s += tich;
        }
        System.out.println(s);
    }
}
