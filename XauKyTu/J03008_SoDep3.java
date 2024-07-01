
package XauKyTu;
import java.util.Scanner;
public class J03008_SoDep3 {
    public static boolean ChuSoNguyenTo(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != '2' && a.charAt(i) != '3' && a.charAt(i) != '5' && a.charAt(i) != '7') return false;
        }
        return true;
    }
    
    public static boolean ThuanNghich(String a){
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(ChuSoNguyenTo(s) && ThuanNghich(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
