
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class Rectange{
    private double width, height;
    private String color;
    public Rectange(){
        height = 1;
        width = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHight(double height){
        this.height = height;
    }
    public String getColor(){
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return height*width;
    }
    public double findPerimeter(){
        return 2*(height + width);
    }
    @Override
    public String toString(){
        return String.format("%d %d %s", (int)findPerimeter(), (int)findArea(), getColor());
    }
}
public class J04002_KhaiBaoLopHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- >0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            String z = sc.next();
            
            if(x>0 && y>0){
                Rectange a = new Rectange(x, y, z);
                System.out.println(a);
            }
            else System.out.println("INVALID");
            
        }
    }
}
