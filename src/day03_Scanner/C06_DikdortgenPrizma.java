package day03_Scanner;

import java.util.Scanner;

public class C06_DikdortgenPrizma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("dikdortgen prizmanın kisa kenar,uzun kenar ve yukseklini sırayla giriniz...");

        int a = scan.nextInt();
        short b = scan.nextShort();
        byte h = scan.nextByte();
        System.out.println("dikdortgen prizmanin hacmi= " + (a * b * h));
    }
}
