
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class SoPhuc{
    private int thuc, ao;
    public SoPhuc(){
        thuc = 0;
        ao = 0;
    }
    public SoPhuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    public static SoPhuc Tong(SoPhuc a, SoPhuc b){
        SoPhuc res = new SoPhuc();
        res.thuc = a.thuc + b.thuc;
        res.ao = a.ao + b.ao;
        return res;
    }
    public static SoPhuc tich(SoPhuc a, SoPhuc b){
        SoPhuc res = new SoPhuc();
        res.thuc = a.thuc*b.thuc - a.ao*b.ao;
        res.ao = a.thuc*b.ao + a.ao*b.thuc;
        return res;
    }
    public String in(int a){
        if(a>0) return "+ " + a;
        else if(a<0) return "- " + Math.abs(a);
        return "";
    }
    @Override
    public String toString(){
        return thuc +" "+ in(ao) +"i";
    }
}
public class J04018_TinhToanSoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc res = SoPhuc.Tong(a, b);
            SoPhuc c = SoPhuc.tich(res, a);
            SoPhuc d = SoPhuc.tich(res, res);
            System.out.println(c +", "+ d);            
        }

    }
}
