
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;
class Point3D{
    private int x, y, z;
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static Point3D vt(Point3D a, Point3D b){
        Point3D v = new Point3D(b.x - a.x, b.y - a.y, b.z - a.z);// ab=b-a;
        return v;
    }
    public static int TichVoHuong(Point3D a, Point3D b){
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }
    public static Point3D TichCoHuong(Point3D a, Point3D b){
        Point3D k = new Point3D(a.y*b.z - a.z*b.y, a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
        return k;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
          
        Point3D ab = vt(a, b);
        Point3D ac = vt(a, c);
        Point3D ad = vt(a, d);
        Point3D p = TichCoHuong(ab, ac);
        return TichVoHuong(p, ad)==0;
    }
    
    
}
public class J04011_BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
    }
}
