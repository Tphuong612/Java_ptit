package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;


class DiemDanh{
        private String ma,ten,lop;
        private int diem;

        public DiemDanh(String ma, String ten, String lop) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
        }
        public String getMa(){
            return ma;
        }
        public int getDiem(){
            return diem;
        }
        
        public void setDiem(int a){
            this.diem = a;
        }
        public int diem(String z){
            int x=0,m=0,v=0;
            for(int i=0;i<z.length();i++){
                if(z.charAt(i)=='x'){
                    x++;
                }
                else if(z.charAt(i)=='v'){
                    v++;
                }
                else m++;
            }
            int dd=10-(m*1+v*2);
            if(dd<0){
                return 0;
            }
            return dd;
        }
        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+diem;
        }
 
}
public class DiemDanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DiemDanh> arr = new ArrayList<>();
        ArrayList<String> ten = new ArrayList<>();
        for(int i=0;i<n;i++){
            DiemDanh a = new DiemDanh(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a);
        }
        
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            String word[] = s.trim().split(" +");
            String madd = word[0];
            String landd = word[1];
            for(DiemDanh x: arr){
                if(x.getMa().equals(madd)){
                    int kq = x.diem(landd);
                    x.setDiem(kq);
                }
            }
            
        }
        for(DiemDanh i: arr){
            if(i.getDiem()>0) System.out.println(i);
            else System.out.println(i+" KDDK");
        }
    }  
  
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
*/