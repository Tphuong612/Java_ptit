//
//package XuLyFile;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.TreeSet;
//
//
//class WordSet{
//    private TreeSet<String> ts = new TreeSet<>();
//
//    public WordSet() {
//    }
//    public WordSet(String file) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File(file));
//        while(sc.hasNextLine()){
//            String s = sc.nextLine().toLowerCase();
//            String word[] = s.trim().split(" +");
//            this.ts.addAll(Arrays.asList(word));
//        }
//    }
//    public WordSet union(WordSet s){
//        WordSet hop = new WordSet();
//        for(String i: ts){
//            hop.ts.add(i);
//        }
//        for(String i: s.ts){
//            hop.ts.add(i);
//        }
//        return hop;
//    }
//    public WordSet intersection(WordSet s){
//        WordSet giao = new WordSet();
//        for(String i: ts){
//            if(s.ts.contains(i)) giao.ts.add(i);
//        }
//        return giao;
//    }
//    @Override
//    public String toString(){
//        String kq ="";
//        for(String i: ts){
//            kq += i+" ";
//        }
//        return kq.trim();
//    }
//}
//public class J07014_HopVaGiaoCuaHaiFileVanBan {
//    public static void main(String[] args) throws IOException {
//        WordSet s1 = new WordSet("D:\\Hoc Tap\\code\\java\\DATA1.in.txt");
//        WordSet s2 = new WordSet("D:\\Hoc Tap\\code\\java\\DATA2.in.txt");
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//    }
//}
