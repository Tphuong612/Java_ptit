
package LapTrinhCanBan;
import java.util.Scanner;
public class J01003_PTBacNhat {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a==0 && b==0) 
            System.out.println("VSN");
        else if (a==0 && b!=0) 
            System.out.println("VN");
        else
            System.out.println(String.format("%.2f", -b/a));
    }
}
