package day02_variableScanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanicidan deger almak icin 3 adim takip edilir
        // 1-Scanner objesi olusturmak

        Scanner scan=new Scanner(System.in);

        // 2- kullaniciya ne istediginizi soylemek

        System.out.println("Lutfen isminizi yazınız");

        String isim=scan.next();
        System.out.println("isminiz : " + isim);

        //scan bir scanner objesidir
        //isim olarak farkli bir isim yazsak da calisir biz scan demeyi tercih ederiz
        //scan bir obje oldugu icin non-primitive'dir
        //primitive data turleri sadece deger icerirken,non-primitive data turleri degerin yanında bir de methodlar
        //barındırır.
        //scan. dedigimizde kullanabilecegimiz bu method'ları gorebiliriz
    }
}
