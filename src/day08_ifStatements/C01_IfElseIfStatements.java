package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {

    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini isteyin gecerli gun ismi ise gun isminin 1., 2. ve 3. harflerini
        ilk harf büyük diğer ikisi kucuk olarak yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Gun ismini girin...");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")|| gun.equals("pazar")){
            System.out.println("Paz");
        } else if (gun.equals("cumartesi")||gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        }else {
            System.out.println("Gecerli gun ismi girin");
        }


    }
}
