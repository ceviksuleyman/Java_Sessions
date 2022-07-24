package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip bizim variable'imiza store eder.
        time1 varible'inin degeri SABITTIR.
         */
        System.out.println(time1); // 18:51:29.655142700

        Thread.sleep(3000);

        time1 = LocalTime.now();

        System.out.println(time1);

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000)); // 10000 sn sonra

        System.out.println(time1.minusMinutes(200)); // 200 dk once

        System.out.println(time1.withHour(3)); // saati 3 yapti
    }
}
