
package LapTrinhCanBan;

import java.util.Scanner;
import java.util.Arrays;
public class J01025_hinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[4];
        int y[] = new int[4];
        for(int i=0; i<4; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int a = Math.max(x[3]-x[0], y[3]-y[0]);
        System.out.println(a*a);
    }
}
