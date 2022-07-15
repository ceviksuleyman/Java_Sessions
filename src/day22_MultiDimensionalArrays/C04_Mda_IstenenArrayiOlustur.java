package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_Mda_IstenenArrayiOlustur {

    public static void main(String[] args) {
        /*
        4-Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana yazdiran bir program yaziniz
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int[][] input = { {1,2,3}, {4,5}, {6,7} };
        int[] yeniArr = new int[input.length]; //yeni array'i olustruduk ve uzunlugunu Mda array'in length'i kadar
        int total = 0;

        for (int i = 0; i < input.length ; i++) { // dis loop outer array'i geziyor

            for (int j = 0; j < input[i].length; j++) { // ic loop inner array'leri geziyor

                total+=input[i][j];// inner loop bittiginde ilk 0 daki ic array'i 1+2+3 topladi=6
            }                      // tekrar dondugunde 1 deki ic array'i 4+5 =9 yapti
                                   // tekrar dondugunde 2 deki ic array'i 6+7=13  her toplamadan sonra yeniArr ekledik ve

                                    // total'i sifirladik ki uzerine toplamasin!

            yeniArr[i]=total;     //bu 6'yi outer loop basa donmeden yeniArr[i]'e ekledik ve toplami sifirladik
            total=0;              // yeniArr[i]'e  9'u birakti  ve toplami sifirladi
                                  // yeniArr[i]'e  13'u birakti  ve int yeniArr[] = {6,9,13} olustu.
        }
        System.out.println("istenen yeni array: "+ Arrays.toString(yeniArr)); // [6, 9, 13]

    }
}
