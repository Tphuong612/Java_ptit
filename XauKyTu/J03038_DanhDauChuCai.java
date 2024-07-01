
package XauKyTu;
import java.util.Scanner;
import java.util.TreeSet;
public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        TreeSet<Character> s = new TreeSet<>();
        for(int i=0; i<a.length(); i++){
            s.add(a.charAt(i));
        }
        System.out.println(s.size());
    }
}
