
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id, name;
    private int sl;
    public DoanhNghiep(String id, String name, int sl){
        this.id = id;
        this.name = name;
        this.sl = sl;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return id +" "+ name +" "+sl;
    }
    
    @Override
    public int compareTo(DoanhNghiep a){
        return id.compareTo(a.getId());
    }
    
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        while(n-- >0){
           String id = sc.nextLine();
           String name = sc.nextLine();
           int tin = Integer.parseInt(sc.nextLine());
           DoanhNghiep a = new DoanhNghiep(id, name, tin);
           arr.add(a);
        }
        Collections.sort(arr);
        for(DoanhNghiep i: arr){
            System.out.println(i);
        }
        
    }   
}
