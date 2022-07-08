package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {
        /*
        Kullanicidan tamsayilar alin,kullanici cift sayi girdigi surece sayilari yazdirin tek sayi girdiginde
        islemi bitirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=10;

        // =====  while loop ile =======
        /*
          loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz
          while loop'ta,loop'tan once olusturdugumuz bu variable'a atayacagimiz degeri iyi dusunmemiz gerekir.
         */

        while (sayi % 2 == 0) {   // bu sarta gore sayi variable'i 1 yaparsak loop hic calismaz variable olustururken
                                    //dikkat edilmesi gereken yer while loop'da burasidir
            System.out.println("1Lutfen bir sayi giriniz..");
            sayi= scan.nextInt();

            if (sayi%2 == 0) {
                System.out.println("1Girilen sayi cift: "+sayi);
            }else {
                System.out.println("1Girilen sayi tek: "+sayi);
            }

        }
        //======== do while loop ile========
        /*
        do while loop'ta onceden olusturdugumuz variable'a atanan ilk deger ne olursa olsun atanan deger sarti
        saglamiyorsa bile en az bir defa calisir! Bu nedenle verdigimiz ilk degere dikkat etmemiz gerekir!!!!

        !!=> Bu durumun dezavantaji;
        ilk calistirma kontrol yapilmadan oldugu icin loop'un body'sinde yanlis bir islem yapilmamasina
        dikkat etmek gerekir.
         */
        do {
            System.out.println("2Lutfen bir sayi giriniz..");
            sayi= scan.nextInt();

            if (sayi%2 == 0) {
                System.out.println("2Girilen sayi cift: "+sayi);
            }else {
                System.out.println("2Girilen sayi tek: "+sayi);
            }

        }while (sayi%2==0);

        /*
               ==OZET OLARAK==
        While Loop,dongunun baslangicinda kosulu kontrol eder ve kosul saglanirsa body icindeki kodlari calistirir.

        Do-while loop'ta ise,kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir.
         */

    }
}
