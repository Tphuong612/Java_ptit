
package LapTrinhCanBan;
import java.util.Scanner;
public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String kq = "";
            int check = 0;
            for(int i=0; i<s.length(); i++){ //kiem tra tung ki tu cua xau vua nhap
                char kytu = s.charAt(i);
                if(kytu == '0' || kytu == '8' || kytu == '9'){
                    kq += 0;
                }
                else if(kytu == '1'){
                    kq += 1;
                }
                else{
                    check = 1;
                    break;
                }
            }
            long giaTri = 0;
            if(check == 0){
      
                for(int i=0; i<kq.length(); i++){ //chuan hoa sang dang so
                    giaTri += (kq.charAt(i) - '0')*Math.pow(10, kq.length() - i - 1);
                }
                if(giaTri != 0)System.out.println(giaTri);
                else System.out.println("INVALID");
            }
            else System.out.println("INVALID");
        }
        
    }
}
