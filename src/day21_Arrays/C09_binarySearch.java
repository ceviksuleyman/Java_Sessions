package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {

    public static void main(String[] args) {
        /* binarySearch() method'u siralanmis array'de aradigimiz elementin index'ini dondurur.

        ya aradigimiz element array'de yoksa ?
        (String'de indexOf() bize olmayan elemanlar icin -1 donduruyordu)
         */

        int[] sayilar = {3, 15, 10,27, 4, 7};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));// [3, 4, 7, 10, 15, 27]

        System.out.println(Arrays.binarySearch(sayilar, 4));// index= 1

        System.out.println(Arrays.binarySearch(sayilar, 15));// index= 4

        // NOTE ==> aradigimiz eleman array'de yoksa java hem olmadigini hem de olsaydi nerede olacagini bize dondurur.
        // Olmadigini ifade icin - kullanir,
        // olsaydi nerede olacagini belirtmek icin index DEGIL siralama kullanir !

        //========= VARSA INDEX, YOKSA -SIRA ==========
        System.out.println(Arrays.binarySearch(sayilar,11));// -5

        System.out.println(Arrays.binarySearch(sayilar,6));// -3

        System.out.println(Arrays.binarySearch(sayilar,-100));// -1

    }
}
