
import static java.lang.Character.isDigit;
import java.util.Scanner;

public class Bai2 {
    public static boolean check(String a){
        if(a.length()%2==0) return false;
        for(int i=0;i<=a.length()/2;i++){
            if(isDigit(a.charAt(i))) return false;
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;   
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().toLowerCase();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
