package day09_Ternary;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        //kullanicidan bir sayi isteyin, sayi pozitifse sayiyi yazdirin
        //sayi negatifse bir sayi daha isteyin ve sayinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        double sayi= scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("bir sayi daha girin");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

        /*
        eger if else icerisinde yeni kodlar varsa ternary ile yapmamiz mumkun olmazz
         */



    }
}
