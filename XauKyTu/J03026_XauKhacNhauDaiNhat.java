
package XauKyTu;
import java.util.Scanner;
public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equals(b)) System.out.println("-1");
            else{
                int max = Math.max(a.length(), b.length());
                System.out.println(max);
            }
        }
    }
}
