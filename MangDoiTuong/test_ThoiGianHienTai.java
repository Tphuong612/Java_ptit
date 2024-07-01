/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

/**
 *
 * @author Admin
 */

import java.util.Date;
//C1:
//public class test_ThoiGianHienTai {
//    public static void main(String[] args) {
//        // Lấy thời gian hiện tại
//        Date currentTime = new Date();
//
//        // In ra thời gian hiện tại
//        System.out.println("Thời gian hiện tại là: " + currentTime);
//    }

//c2:
//import java.time.Instant;
//
//public class test_ThoiGianHienTai {
//    public static void main(String[] args) {
//        // Lấy thời gian hiện tại
//        Instant currentTime = Instant.now();
//
//        // In ra thời gian hiện tại
//        System.out.println("Thời gian hiện tại là: " + currentTime);
//    }
//}

import java.util.Calendar;
 
public class test_ThoiGianHienTai {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Ngay gio hien tai: " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 ngay sau: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 thang sau: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 nam sau: " + calendar.getTime());
    }
}