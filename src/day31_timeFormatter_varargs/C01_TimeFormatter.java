package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {

        /*-------------------- GUN  -----------------------------------------
		 d        : basta 0 varsa onu yazmadan gun numarasi
		 dd       : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD      : yilin kacinci gunu oldugunu yazar
		 E,EE,EEE : gun isminin ilk 3 harfi
		 EEEE     : gun isminin tamamini
		 --------------------   AY  ----------------------------------------
		 M    : basta 0 varsa onu yazmadan ay numarasini
		 MM   : tek haneli aylari 01 gibi basina sifir yazarak ay numarasini
		 MMM  : Ay isminin ilk 3 harfini
		 MMMM : Ay isminin tamamini
		 YY   : yilin son iki rakamini
		 YYYY : Yilin tamamini
		 -------------------   Saat  ----------------------------------------
		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : 24 saati uzerinden
		 hh : pm / am format 12 duzeni
		 m  : minute
		 a  : yazarsak AM veya PM yazar */

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println("ilk olusturulan tarihSaat = " + tarihSaat);


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE/MMMM/yyyy  hh:mm");

        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm");

        System.out.println(dtf2.format(tarihSaat));

    }
}
