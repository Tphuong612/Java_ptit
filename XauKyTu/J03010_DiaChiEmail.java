
package XauKyTu;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> ktr = new LinkedHashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine().trim().toLowerCase();
            
            String word[] = a.split(" +");
            
            String ten = word[word.length - 1];
            for(int i=0; i<word.length-1; i++){
                ten += word[i].charAt(0);
            }

            if(!ktr.containsKey(ten)){
                System.out.println(ten + "@ptit.edu.vn");
                ktr.put(ten, 1);
            }
            else{
                ktr.put(ten, ktr.get(ten) + 1);
                System.out.println(ten + ktr.get(ten).toString() + "@ptit.edu.vn");
            }
            
        }
    }
}
