
package MangDoiTuong;

import java.util.Scanner;

class GiangVien{
    private String name, mon, ma;
    private static int dem = 0;
    public GiangVien(String name, String mon){
        this.ma = String.format("GV%02d", ++dem);
        this.name = name;
        this.mon = mon;       
    }
    public String chuanHoa(){
        String kq = "";
        String word[] = mon.toUpperCase().split(" +");
        for(String i: word){
            kq += i.charAt(0);
        }
        return kq;
    }
    @Override
    public String toString(){
        return ma +" "+name+" "+chuanHoa();
    }
    public boolean check (String a){
        String word[] = name.toLowerCase().split(" +");
        String k = a.toLowerCase();
        for(String i: word){
            if(i.contains(k)) return true;
        }
        return false;
    }
    
}
public class J05027_TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GiangVien a[] = new GiangVien[n];
        for(int i=0; i<n; i++){
            a[i] = new GiangVien(sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        
        while( q-- >0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(GiangVien i: a){
                if(i.check(s)) System.out.println(i);
            }
        }
 
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
*/