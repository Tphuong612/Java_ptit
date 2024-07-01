
package XauKyTu;
import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){           
            String a = sc.nextLine().trim();
            String word[] = a.split(" +");
            for(String i: word){
                i = new StringBuilder(i).reverse().toString();
                System.out.print(i + " ");
            }
            System.out.println(""); 
        }
        
    }
}
/*
2
ABC DEF
123 456
*/