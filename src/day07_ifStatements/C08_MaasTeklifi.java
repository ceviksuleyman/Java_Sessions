package day07_ifStatements;

import java.util.Scanner;

public class C08_MaasTeklifi {

    public static void main(String[] args) {

        //kullanicidan maas icin teklif isteyin ve asagidaki degerleri yazdirin
        //teklif 80000 üzerinde ise kabul ediyorum
        //60000-80000 arasında ise konusabilir
        //60000 altinda ise malesef kabul edemem yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Maas teklifinizi söyleyin...");
        double maas= scan.nextDouble();

        if (maas>=80000){
            System.out.println("Kabul ediyorum");
        } else if (maas >= 60000 && maas<80000) {
            System.out.println("Teklifinizi konusabiliriz");
        }else {
            System.out.println("Malesef Kabul edemem");
        }


    }
}
