package day03_Scanner;

import java.util.Scanner;

public class C05_CemberSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("cemberin yaricap degerini giriniz...");

        double r= scan.nextDouble();

        double pi= Math.PI;

        System.out.println("Cemberin cevresi= "+(2*pi*r));
        System.out.println("Dairenin alanı= "+(pi*r*r));
    }
}
