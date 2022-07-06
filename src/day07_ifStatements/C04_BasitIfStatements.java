package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {

    public static void main(String[] args) {

        // Kullanicidan gun ismini alin hafta ici veya hafta sonu oldugunu yazdirin
        // Ornek gun:pazar  output: "Hafta sonu"
        //       gun:sali   output:  " hafta ici"
        // String icin equals methodunu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("Gun ismini girin...");
        String gun=scan.next().toLowerCase();

        if(gun.equals("pazartesi")
                ||gun.equals("sali")
                ||gun.equals("carsamba")
                ||gun.equals("persembe")
                ||gun.equals("cuma")){
            System.out.println("Haftaici");
        }
        if (gun.equals("pazar")
                ||gun.equals("cumartesi")){
            System.out.println("Haftasonu");
        }
        if(!(gun.equals("pazartesi")
                ||gun.equals("sali")
                ||gun.equals("carsamba")
                ||gun.equals("persembe")
                ||gun.equals("cuma")
                ||gun.equals("pazar")
                ||gun.equals("cumartesi"))) {
            System.out.println("Lutfen gun ismi girin");
        }


    }
}
