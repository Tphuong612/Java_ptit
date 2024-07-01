package XauKyTu;
import java.util.Scanner;

public class J03004_ChuanHoaHoVaTen1 {
    
    public static String chuanHoa(String a){
        if(a.length() == 1) return a.toUpperCase();
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() + " ";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //sc.nextLine();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine().trim();
            String word[] = s.split(" +");
            String kq = "";
            for(int i=0; i<word.length; i++){
                kq += chuanHoa(word[i]);
            }
            System.out.println(kq);
            
        }
    }

}