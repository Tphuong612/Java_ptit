
package XauKyTu;

import java.util.ArrayList;
import java.util.Scanner;

public class J03029_ChuanHoaCau {
    public static String cau(String s){
        if(s.charAt(s.length()-1) != '.' && s.charAt(s.length()-1) != '!' && s.charAt(s.length()-1) != '?') s += '.';
        String word[] = s.trim().split(" +");
        String kq = "";
        for(String i: word){
            if(i.equals(".") || i.equals("?") || i.equals("!") )kq = kq.trim();
            kq += i+" ";
        }
        return kq.substring(0, 1).toUpperCase() + kq.substring(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();
        while(sc.hasNextLine()){
            
            String s = sc.nextLine();
            if(s.isEmpty()) break;
            ar1.add(s.toLowerCase());
            
        }
        for(int i=0; i<ar1.size(); i++){
            if(!ar1.get(i).contains(".") && !ar1.get(i).contains("?") && !ar1.get(i).contains("!")){
                ar2.add(ar1.get(i));
                continue;
            }
            int bd = 0;
            for(int j=0; j<ar1.get(i).length(); j++){
                if(ar1.get(i).charAt(j) == '.' || ar1.get(i).charAt(j) == '!' || ar1.get(i).charAt(j) == '?'){
                    String tmp = ar1.get(i).substring(bd, j+1);
                    bd = j+1;
                    ar2.add(tmp);
                }

            }
        }
        for(String i: ar2){
            System.out.println(cau(i));
        }
    }
}
/*
Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet.     Ke theo chuan quoc te.
co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
moi    CAC BAN danG ky     thaM giA !
*/