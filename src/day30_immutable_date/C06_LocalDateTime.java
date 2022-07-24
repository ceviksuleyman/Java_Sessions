package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-07-24T20:00:15.084821400

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(100).plusHours(100));


        System.out.println(tarihSaat.toLocalDate());// 2022-07-24
    }
}
