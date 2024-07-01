
package XauKyTu;
import java.util.Scanner;
public class J03040_BienSoDep {
    public static boolean check1(String a){
        if(a.charAt(5) < a.charAt(6) && a.charAt(6) < a.charAt(7) && a.charAt(7) < a.charAt(9) && a.charAt(9) < a.charAt(10)) return true;
        else if(a.charAt(5)==a.charAt(6) && a.charAt(6)==a.charAt(7) && a.charAt(7)==a.charAt(9) && a.charAt(9)==a.charAt(10)) return true;
        else if(a.charAt(5)==a.charAt(6) && a.charAt(6)==a.charAt(7) && a.charAt(9) == a.charAt(10)) return true;
        return false;

    }
    public static boolean check2(String a){
        for(int i=5; i<=10; i++){
            if(i==8) continue;
            if(a.charAt(i) != '6' && a.charAt(i) != '8') return false;
        }        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine();
            if(check1(a) || check2(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
