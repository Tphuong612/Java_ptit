
package LapTrinhCanBan;
import java.util.Scanner;
public class J01008_PtTSNT {
    public static void testcase(long n){
        if(n==1){
            System.out.println("1(1)");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            int dem=0;
            if(n%i==0){
                System.out.print(i);
                while(n%i==0){
                    dem++;
                    n/=i;
                }
                System.out.print("(" + dem + ")" + " ");
            } 
        }
        
        if(n != 1){
            System.out.print(n + "(1)");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=1;
        while(k<=t){
            long n = sc.nextLong();
            System.out.print("Test " + k + ": ");
            testcase(n);
            k++;
            System.out.println("");
        }
    }
   
}
