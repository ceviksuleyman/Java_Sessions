package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_HocaninCozum {

    public static void main(String[] args) {
        // Soru 2) Verilen bir array'deki tekrar eden elementleri tek bir defa barindiran yeni bir array olarak
        // donduren bir method olusturun

        int[] arr = {2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] uniqueArray = uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        List<Integer> bensersizList = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) { // length -1 den dolayi son index'deki 9'u kontrol etmedi

            // yanindaki elemente esit olmayanlari listeye ekledi
            if (arr[i] != arr[i+1]){  //i+1 dedigimiz de son elementi kontrol etmedi sinirin disina  cikiyor

                bensersizList.add(arr[i]);
            }
        }
        // son elementi kontrol edip yoksa listeye ekliyoruz !
        if (!bensersizList.contains(arr[arr.length-1])){

            bensersizList.add(arr[arr.length-1]); // 9 ayri baktik
        }


        // bensersiz list 1,2,3,4,5,6,9
        // bensersiz listenin size() bilgisini kullanarak bir array olusturduk
        int[] tekrarsizArr = new int[bensersizList.size()];

        // bensersiz listedeki tum elemanlari yeni array'a atadik
        for (int i = 0; i < bensersizList.size(); i++) {

            tekrarsizArr[i] = bensersizList.get(i); // list'deki elemanlari array'a aldik get()
        }



        // olusturdugumuz yeni array'i main method'a gonderdik
        return tekrarsizArr ;
    }
}
