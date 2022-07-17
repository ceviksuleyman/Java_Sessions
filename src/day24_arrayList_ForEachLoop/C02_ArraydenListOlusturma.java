package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {

    public static void main(String[] args) {

        // icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun kullanicidan bir sayi isteyip,
        // list'de var olup olmadigini kullaniciya yazalim.

        Random rnd = new Random();

        int sayi = 0;

        List<Integer> sayiList = new ArrayList<>();

        while (sayiList.size() < 200) {  // sayi listesinin size()'i 200'e kadar devam etsin

            sayi = rnd.nextInt(1000); //0 ile 1000 arasinda sayi ureticek random

            if (!sayiList.contains(sayi)) { //ayni sayilar olmasin dedik random gelcek sayilardan

                sayiList.add(sayi); // ve list'e ekledik
            }
        }
        System.out.println(sayiList);

        boolean bildiMi = false;
        int tahminSayisi = 1; //ilk tahminde bulunma durumundan dolayi 1

        Scanner scan = new Scanner(System.in);

        while (!bildiMi) {

            System.out.print("Lutfen bir sayi tahmininde bulunun : ");
            sayi = scan.nextInt();

            if (sayiList.contains(sayi)) {

                System.out.println("Tebrikler "+tahminSayisi+" adet tahminde listeden bir sayi buldunuz.");
                bildiMi = true;

            }else {

                System.out.println(tahminSayisi+" adet sayi soylediniz ama hic biri list'de yok.");
                tahminSayisi++;
            }
        }

    }
}
