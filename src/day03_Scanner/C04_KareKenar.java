package day03_Scanner;

import java.util.Scanner;

public class C04_KareKenar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Verilen karenin 1 kenar uzunluğu değerini giriniz...");

        Double kenar = scan.nextDouble();

        System.out.println("Karenin çevre uzunlugu= " + (kenar * 4));
        System.out.println("Karenin alanı= " + (kenar * kenar));
    }
}
