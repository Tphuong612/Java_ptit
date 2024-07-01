
package XauKyTu;

import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine().trim();
            String number[] = a.split(" +");
            int chan = 0, le = 0;
            for(String i: number){
                if((i.charAt(i.length()-1)-'0')%2==0) chan++;
                else le++;
            }
            if(number.length%2==0 && chan>le || number.length%2==1 && le>chan) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
