//
//package MangDoiTuong;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//class VDV{
//    private String ten, ma;
//    private Date dob, bd, kt;
//    public static int dem = 0;
//    private SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//    private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
//    
//    public VDV(String ten, String dob, String bd, String kt) throws ParseException{
//        this.ma = String.format("VDV%02d", ++dem);
//        this.ten = ten;
//        this.dob = sdf1.parse(dob);
//        this.bd = sdf2.parse(bd);
//        this.kt = sdf2.parse(kt);
//    }
//    public String chuan(Duration a){
//        long gio = a.toHours();
//        String gio1 = String.format("%02d", gio);
//        long phut = a.toMinutes()- gio*60;
//        String phut1 = String.format("%02d", phut);
//        long giay = a.getSeconds() - phut*60 - gio*3600;
//        String giay1 = String.format("%02d", giay);
//        String kq = String.format("%s:%s:%s", gio1, phut1, giay1);
//        return kq;
//    }
//    public String Thuc(){
//        Duration dur  = Duration.between(bd.toInstant(), kt.toInstant());
//        String during = chuan(dur);
//        return during;
//    }
//    public String UuTien(){
//        String namsinh = sdf1.format(dob);
//        int tuoi = 2021 - Integer.parseInt(namsinh.substring(6));
//        if(tuoi < 18) return chuan(Duration.ofSeconds(0));
//        else if(tuoi>=18 && tuoi<25) return chuan(Duration.ofSeconds(1));
//        else if(tuoi>=25 && tuoi<32) return chuan(Duration.ofSeconds(2));
//        return chuan(Duration.ofSeconds(3));
//    }
//    public String kq() throws ParseException{
//        Date a = sdf2.parse(Thuc());
//        Date b = sdf2.parse(UuTien());
//        Duration dur = Duration.between(b.toInstant(), a.toInstant());
//        String s = chuan(dur);
//        return s;
//    }
//    @Override
//    public String toString(){
//        try {
//            return ma+" "+ten+" "+Thuc() +" "+UuTien()+" "+kq();
//        } catch (ParseException ex) {
//            Logger.getLogger(VDV.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//   
//    
//}
//public class J05055_XepHangVanDongVien1 {
//    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        VDV a[] = new VDV[n];
//        ArrayList<String> arr = new ArrayList<>();
//        int b[] = new int[n];
//        for(int i=0; i<n; i++){
//            b[i] = i+1;
//            a[i] = new VDV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(a[i].kq());
//        }
//        Collections.sort(arr);
//        for(int i=1; i<arr.size(); i++){
//            if(arr.get(i).equals(arr.get(i-1))) b[i] = b[i-1];
//        }
//        for(int i=0; i<n; i++){
//            int k = arr.indexOf(a[i].kq());
//            System.out.println(a[i]+" "+b[k]);
//        }
//        
//
//    }
//}
///*
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
//*/