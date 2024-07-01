///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Khai_Bao_Lop_Va_Doi_Tuong;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.TreeSet;
//class WordSet{
//    private TreeSet<String> ts;
//    public WordSet(TreeSet<String> a){
//        this.ts = a;
//    }
//    public WordSet(String line){
//        this.ts = new TreeSet<>();
//        String word[] = line.trim().toLowerCase().split(" +");
//        this.ts.addAll(Arrays.asList(word));
//    }
//    public WordSet union(WordSet b){
//        TreeSet<String> hop = new TreeSet<>();
//        hop.addAll(ts);
//        hop.addAll(b.ts);
//        return new WordSet(hop);
//    }
//    public WordSet intersection(WordSet b){
//        TreeSet<String> giao = new TreeSet<>();
//        for(String i: b.ts){
//            if(ts.contains(i)) giao.add(i);
//        }
//        return new WordSet(giao);
//    }
//    @Override
//    public String toString(){
//        String tmp ="";
//        for(String i: ts) tmp += i +" ";
//        return tmp;
//          
//    }
//    
//}
//public class J04022_LopWordSet {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        WordSet s1 = new WordSet(in.nextLine());
//        WordSet s2 = new WordSet(in.nextLine());
//        
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//    }
//}
///*
//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++
//*/
