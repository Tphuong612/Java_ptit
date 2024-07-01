
package XauKyTu;
import java.util.Scanner;
public class J03024_SoUuThe {
    public static int check(String a){        
        if(a.charAt(0)=='0') return 2;
        int chan = 0, le = 0;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)<'0' || a.charAt(i)>'9') return 2; //INVALID
            if((a.charAt(i)-'0')%2==0){
                chan++;
            }
            else le++;
        }
        if(a.length()%2==0 && (chan>le) || a.length()%2==1 && (le<chan)) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check(s)==2) System.out.println("INVALID");
            else if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
