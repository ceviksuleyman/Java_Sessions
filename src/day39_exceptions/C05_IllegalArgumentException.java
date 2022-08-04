package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {

    public static void main(String[] args) {

        // Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.

        Scanner sc = new Scanner(System.in);
        System.err.print("yasinizi girin : ");

        int yas = sc.nextInt();

        try {
            if (yas < 0) {

                throw new IllegalArgumentException();

            } else {

                System.err.println("yasiniz : " + yas);

            }
        } catch (IllegalArgumentException e) {

            System.err.println("Negatif yas mi olur birader ?");
            e.printStackTrace();

        }
    }
}
