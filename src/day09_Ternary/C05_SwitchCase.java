package day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {

    public static void main(String[] args) {

        //Kullanicidan gun numarasini alip 1 ise pazartesi......7 ise pazar yazdiralim

        Scanner scan= new Scanner(System.in);
        System.out.println("Kacinci gun oldugunu girin..");
        int gunNo= scan.nextInt();
        /*
        Switch yanina yazilan ( ) neye gore case atayacagimiz gosterir
        Java girilen deger gore case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye kadar veya switch parantezine kadar devam eder...

        if -else if ... else yapisinda oldugu gibi hicbir sarta uymayanlari default keyword kullanilir
         */

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
            System.out.println("gecerli sayi girin");

        }




    }
}
