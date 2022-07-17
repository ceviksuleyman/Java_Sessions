package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {

    public static void main(String[] args) {

        // Soru 2) Verilen bir array'deki tekrar eden elementleri tek bir defa barindiran yeni bir array olarak
        // donduren bir method olusturun

        int[] arr = {2,3,5,6,3,5,4,1,9,6,3,5,5};

        Integer[] uniqueArray = uniqueArrayOlustur(arr);//tekrarsiz elemanli array'i bize dondurecek method olusturduk

        System.out.println(Arrays.toString(uniqueArray));// [1, 2, 3, 4, 5, 6, 9]

    }
    public static Integer[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr); // arrayi siraladik
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

        //kac tane unique element oldugunu bilmiyoruz ve bir list olusturmamiz gerekli array olusturamayiz

        List<Integer> benzersizList = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] != arr[i+1]){

                benzersizList.add(arr[i]); //benzersiz list olusturduk ama bizden array istiyor
            }
        }
        if (!benzersizList.contains(arr[arr.length - 1])) { // son index'i ayri inceledik arr.length-1 de i+1 den
                                                            // dolayi loop son index'i incelemedi !
            benzersizList.add(arr[arr.length-1]);
        }

        //1,2,3,4,5,6,9 benzersiz listemiz bu

        //benzersizlist'deki tum elemanlari yeni array'a atadik..
        Integer[] tekrarsizArr = benzersizList.toArray(new Integer[0]); // arraylist'i array yaptik !!!!!!

        return tekrarsizArr;

    }
}
