package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {

    public static void main(String[] args) {
        //Soru-1 verilen bir array'deki tekrar eden elementleri yazdirin.

        int[] arr = {2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == arr[i+1] && !tekrarEdenler.contains(arr[i])){ //tekrar eden sayilar fazlaysa listte bunu onledik

                System.out.print(arr[i]+" ");// 3 3 5 6        3 u 2 defa aldi olmaz list olusturalim
                tekrarEdenler.add(arr[i]);
            }
        }

    }
}
