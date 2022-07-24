package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {

        // iki tarih arasindaki sureyi bulalim

        LocalDate tarih1 = LocalDate.of(1993,1,21);
        LocalDate bugun = LocalDate.now();


        Period period = Period.between(tarih1,bugun);

        System.out.println(period); // P29Y6M3D

        System.out.println(period.getYears()); // 29
    }
}
