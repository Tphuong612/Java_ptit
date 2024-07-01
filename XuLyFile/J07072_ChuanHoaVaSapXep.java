/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Person implements Comparable<Person>{
    private String ten, ho, dem, fullname;
    public Person(String name){
        String word[] = name.trim().toLowerCase().split(" +");
        this.ten = word[word.length - 1];
        this.ho = word[0];
        if(word.length > 2){
            String kq = "";
            for(int i=1; i<word.length - 1; i++){
                kq += word[i];
            }
            this.dem = kq;
        }
        String tmp = "";
        for (int i=0; i<word.length; i++) {
            tmp += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if(i != word.length -1){
                tmp += " ";
            }
        }
        this.fullname = tmp;       
    }
    @Override
    public String toString(){
        return fullname;
    }
    @Override
    public int compareTo(Person o){
        if(ten.equals(o.ten) && ho.equals(o.ho)) return dem.compareTo(o.dem);
        else if(ten.equals(o.ten)) return ho.compareTo(o.ho);
        return ten.compareTo(o.ten);
    }
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Person> arr = new ArrayList<>();
        while(sc.hasNext()){
            Person a = new Person(sc.nextLine());
            arr.add(a);
        }
        Collections.sort(arr);
        for(Person i: arr){
            System.out.println(i);
        }
    }
    
    
}
