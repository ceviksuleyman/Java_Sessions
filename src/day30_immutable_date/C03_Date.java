package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {

    /* Java'da tarih ve zaman icin 3 class vardir.Bunlarin kendimize uygun olani secip object olusturarak kullanabiliriz.
    1- Local Date :
       LocalDate currentDate1 = LocalDate.now();

    2- Local Time :
       LocalTime currentTime1 = Localtime.now();

    3- Local Date Time :
       LocalDateTime currentTime1 = LocalDateTime.now(); */

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);// 2022-07-24

        System.out.println(tarih.getDayOfYear()); // 205. gun

        System.out.println(tarih.getDayOfWeek()); // SUNDAY

        System.out.println(tarih.getMonthValue());// 7. ay

        System.out.println(tarih.isLeapYear());// false artik yil degil


        LocalDate tarih2 = LocalDate.of(2001,5,15);

        System.out.println(tarih2);// 2001-05-15

        LocalDate tarih3 = LocalDate.of(1993, Month.JANUARY,21);

        System.out.println(tarih3);// 1993-01-21


        System.out.println(tarih.plusDays(100));// 2022-11-01  100 gun sonraki tarih

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));// 2027-11-05

        System.out.println(tarih.minusWeeks(20));// 2022-03-06 20 hafta once tarih

        System.out.println(tarih.minusDays(100).minusMonths(5));// 2021-11-15 100 gun 5 ay once

        System.out.println(tarih.isAfter(tarih2));// true tarih tarih2 den sonra mi


        // iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulun. tarih2 ve tarih3 icin

        if (tarih2.isAfter(tarih3)) {

            System.out.println(tarih3+" tarihinde dogan daha buyuk");

        } else if (tarih2.isBefore(tarih3)) {

            System.out.println(tarih2+" tarihinde dogan daha buyuk");
        }else
            System.out.println("iki tarih ayni");


    }
}
