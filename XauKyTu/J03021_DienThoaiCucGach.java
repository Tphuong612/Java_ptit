
package XauKyTu;
import java.util.Scanner;
public class J03021_DienThoaiCucGach {
    public static boolean ThuanNghich(String a){
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)) return false;
        }
        return true;
    }
    public static String chuanHoa(String a){
        String kq = "";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='A'||a.charAt(i)=='B'||a.charAt(i)=='C') kq += '2';
            else if(a.charAt(i)=='D'||a.charAt(i)=='E'||a.charAt(i)=='F') kq += '3';
            else if(a.charAt(i)=='G'||a.charAt(i)=='H'||a.charAt(i)=='I') kq += '4';
            else if(a.charAt(i)=='J'||a.charAt(i)=='K'||a.charAt(i)=='L') kq += '5';
            else if(a.charAt(i)=='P'||a.charAt(i)=='Q'||a.charAt(i)=='R'||a.charAt(i)=='S') kq += '7';
            else if(a.charAt(i)=='M'||a.charAt(i)=='N'||a.charAt(i)=='O') kq += '6';
            else if(a.charAt(i)=='T'||a.charAt(i)=='U'||a.charAt(i)=='V') kq += '8';
            else kq += '9';
        }
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine().toUpperCase();
            a = chuanHoa(a);
            if(ThuanNghich(a)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
