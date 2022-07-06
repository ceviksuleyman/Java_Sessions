package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {

    public static void main(String[] args) {

        /*  Kullanicidan 100 uzerinden notunu isteyin 50 den kucukse "D"
                                      50 ye eşit ve 60 dan kucukse ise "C"
                                      60 a esit veya buyuk 80 den kucukse "B"
                                      80 üzerinde ise "A"
           gecersiz not girildiginde uyari verelim                       */

        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu girin..");
        double not= scan.nextDouble();

        if (not<0||not>100){
            System.out.println("Gecerli bir not girin !");
        } else if (not<50) {           //bu satira geldiyse artık 100 ve 0 arasinda bir deger girilmistir
            System.out.println("Harf notunuz: \"D\"");
        }else if (not<60){             //bu satira geldiyse 50 ile 100 arasinda bir deger
            System.out.println("Harf notunuz: \"C\"");
        } else if (not<80) {           //bu satirda deger 60 ile 100 arasinda
            System.out.println("Harf notunuz: \"B\"");
        }else if (not<100){
            System.out.println("Harf notunuz: \"A\"");
        }


    }
}
