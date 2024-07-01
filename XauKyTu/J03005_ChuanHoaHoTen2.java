
package XauKyTu;
import java.util.Scanner;
public class J03005_ChuanHoaHoTen2 {
    public static String chuanHoaTen(String a){
        if(a.length()==1) return a.toUpperCase();
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
    }
    
    public static String chuanHoaHo(String a){
        return a.toUpperCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().trim();
            String word[] = s.split(" +");
            for(int i=1; i<word.length; i++){
                word[i] = chuanHoaTen(word[i]);
                if(i < word.length - 1)System.out.print(word[i] + " ");
                else System.out.print(word[i]+", ");
            }
            word[0] = chuanHoaHo(word[0]);
            System.out.print(word[0]);
            System.out.println("");
        }
        
    }
}
