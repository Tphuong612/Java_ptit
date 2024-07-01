
package XauKyTu;
import java.util.Scanner;
public class J03007_SoDep2 {
    public static boolean Tong(String a){
        int sum = 0;
        for(int i=0; i<a.length(); i++){
           sum += a.charAt(i) - '0';
        }
        if(sum%10==0) return true;
        else return false;
              
    }
    
    public static boolean StartFinish(String a){
        if(a.charAt(0)=='8' && a.charAt(a.length()-1)=='8') return true;
        else return false;
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
            if(StartFinish(s) && Tong(s) && ThuanNghich(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }    
}
