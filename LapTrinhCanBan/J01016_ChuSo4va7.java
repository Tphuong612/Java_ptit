
package LapTrinhCanBan;

import java.util.Scanner;
public class J01016_ChuSo4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dem1=0, dem2=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '4') dem1++;
            else if(s.charAt(i) == '7') dem2++;
        }
        if(dem1 + dem2 ==4 || dem1 + dem2 == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
