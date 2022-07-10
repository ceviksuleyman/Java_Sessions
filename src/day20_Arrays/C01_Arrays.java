package day20_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

         /*
            Arrays: birden fazla variable depolamak icin kullanilan object(non-primitive data)'lerdir.
         1 - Arrays'de sadece primitive datalar veya non-primitive datalara ait referanslar depolanabilir.
         2 - Arrays icindeki tum variable'lar ayni data type'inde olmalidir.
         3 - Arrays object non-primitive'dir,bu yuzden heap memory'de depolanir.
         4 - runtime 'da olusturulurlar.
            Bir Array declare edildiginde stack memory'de referans olusturulur ama Array henuz olusturulmamistir.
         5 - Array nasil declare edilir?
              1- int myArray[]; ( bu daha cok kullanilir )
              2- int[] myArray;
         6 - Bir Array nasıl olusturulur?
              1 - int myArray[] = new int[6];
              * yukaridaki kod length'i 6 olan bir Array olusturur.
              * Biz array'e eleman eklemezsek Java elemanlar icin data type'ina uygun default degerler atar.
              * Eger yukaridaki array'i yazdirirsaniz ekranda {0,0,0,0,0,0} gorursunuz.
         */

        // istersek once olusturup sonra istedigimiz index'ler icin deger atayabiliriz.
        int myArray[] = new int[3];
        myArray[0]=9;
        myArray[1]=10;
        myArray[2]=11;

        //Olusturma ve tum index'ler icin deger atamayi tek satirda da yapabiliriz.
        int myArray2[]={9,10,11};
        //-----------------------------------------------------------------------------------------------


        int sayilar[] = new int [3];

        System.out.println(sayilar); //  [I@19dfb72a direk sayilar yazarsak Java bize stack'daki referans'i dondurur!

        /*
        non-primitive data turundeki datalari her zaman direk yazdiramayiz.
        Array'i yazdirmak istersek Arrays class'indan yardim isteriz.
         */
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String sinifList[]={"Ali","Ayse","Ahmet"};

        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayse, Ahmet]

        sinifList[1]="Hasan";

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); //  Hasan
        System.out.println(sinifList[0]); //  Ali




    }
}
