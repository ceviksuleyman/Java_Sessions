package day22_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class C01_MultiDimensionalArrays {

    public static void main(String[] args) {
        /*
        Tek katli array'lerde array'i direk yazdiramiyoruz,cunku array non-primitive data turudur ve her non-primitive
        data direk yazdirilamayabilir.

        Ancak array'in icerisindeki elementleri direk yazdirabiliyorduk,cunku genelde primitice data turu veya String
        elementler kullaniliyordu.

        Multi-dimensional array'lerde en dikkat edecegimiz konu, ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur.
         */
        int [][] sayilar ={{1,2,4,5},{3,4}};

        // Burada sayilar array'ini dusunursek  icinde 2 tane inner Array var; sayilar[0] -> [1,2,4,5]
        // Icerdeki inner bir array'i de oldugu gibi yazdirmak istersek Arrays.toString ile yazdirilir.
        System.out.println(sayilar[0]); // [I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0]));// [1, 2, 4, 5]

        // Ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
        System.out.println(sayilar[0][1]);// 2
        System.out.println(sayilar[1][0]);// 3

        // Multi-dimensional array'in hepsini yazdirmak istersek deepToString method'u kullanabiliriz.
        System.out.println(Arrays.toString(sayilar));// [[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]

        //------------------------------------------------------------------------------------------------------------
         /*
        Array'i iki sekilde declare edebiliyorduk,
        1 - elemanlari direk yazabiliriz
        int[][] sayilar = {{1,2,4,5},{3,4}};

        2 - outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
        int[][] arr = new int[3][2]
        Ancak 2. yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz !!!

        Asagidaki ornekte oldugu gibi bu array'in 3 tane inner array'i vardir ve her bir inner array'in 2'ser tane
        elemani vardir.

        Eger inner array'leri farkli uzunluklarda olusturmak istiyorsaniz mecburen birinci yontemi kullanmalisiniz.
         */
        int[][] arr = new int[3][2];// outer array'de 3 tane inner array olcak ve hepsinin 2 tane elemani olcak.
        arr[0][0]=1;  // degerleri tek tek atayarak multi-dimensional array olusturduk
        arr[0][1]=2;

        arr[1][0]=3;
        arr[1][1]=4;

        arr[2][0]=5;
        arr[2][1]=6;
        System.out.println(arr[2][1]);// 6
        System.out.println(Arrays.deepToString(arr));//  [[1, 2], [3, 4], [5, 6]]

    }
}
