
package XauKyTu;
import java.util.Scanner;
public class J03025_XauDoiXung {
    public static boolean check(String a){
        if(a.length()%2==0){
            int dem = 0;
            for(int i=0; i<a.length()/2; i++){
                if(a.charAt(i) != a.charAt(a.length()-i-1)) dem++;

            }
            return dem==1;
        }
        else{
            int dem = 0;
            for(int i=0; i<a.length()/2; i++){
                if(a.charAt(i) != a.charAt(a.length()-i-1)) dem++;
            }
            return dem==0 || dem==1;           
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    
}
