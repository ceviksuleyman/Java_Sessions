package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    /*
     NOTE ==> Java'da list veya array'in elemanlarini uptade ettiginizde elemanlar kalici olarak degisir.
     List veya array'in kendisi degismez elemanlari kalici olarak degisir.
     */

    public static void main(String[] args) {
        // Verilen 4 elemanli bir array'i method'a gonderelim,method'da yeni 3 elemanli bir array atayip bu yeni array'e
        // rastgele 100 den kucuk 3 sayi atayalim method'da array'i yazdiralim.
        // main method'da da method call'dan sonra yeniden array'i yazdiralim.

        int[] arr = {3,5,8,10};

        System.out.println(arr); // [I@19dfb72a

        arrayiDegistir(arr);

        System.out.println("Method call'dan sonra main method'da Array : "+Arrays.toString(arr));// [3, 5, 8, 10]

        // referanslar farkli
        // method'da yeni bir array olustrudugumuz icin ilk array'imiz ayni sekilde kaldi

    }
    /*
    Birden fazla element iceren array ve arrayList gibi yapilarda da passByValue gecerlidir.

    Eger method'da array veya list'in kendisi degistirilirse  passByValue ozelligi sebebiyle Java degisen degeri degil,
    array veya List'in orginal degerini alir.

    Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse,Java obje degismedigi icin(referans ayni)
    ayni array veya List'i bize dondurur,ancak icindeki elementler degismis olacaktir.
     */
    private static void arrayiDegistir(int[] arr) {
        Random rnd = new Random();
        arr = new int[3];
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println(arr);// [I@3d24753a

        System.out.println("Method'da Array : "+ Arrays.toString(arr));

    }
}
