package day21_Arrays;

import java.util.Arrays;

public class C10_Arrays_equals {

    public static void main(String[] args) {
        // equals() method'u degerleri ve indexleri birlikte kontrol edip,boolean bir deger dondurur.

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {8,2,9,4,7};// degerler farkli oldugundan false doner
        System.out.println(Arrays.equals(arr1,arr2));// false
        //-------------------------------------------------------------------------------------------------------------

        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,5,4,3}; //ayni degerler olsa bile indexleri farkli oldugundan false doner
        System.out.println(Arrays.equals(arr3,arr4));// false
        Arrays.sort(arr4);//siralamayi duzenleyip ayni degerler oldugu icin tekrar esit mi diye kontrol edersek true olur
        System.out.println(Arrays.equals(arr3,arr4));// //true

        //--------------------------------------------------------------------------------------------------------------
        int[] arr5 = {9,8,7,6,5};
        int[] arr6 = {9,8,7,6,5}; // degerler ve indexleri ayni oldugundan true doner!!!
        System.out.println(Arrays.equals(arr5,arr6));//true
    }
}
