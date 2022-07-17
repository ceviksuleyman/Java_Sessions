package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {

    public static void main(String[] args) {

        // List ile calisirken en kotu ozelligi elemanlari tek tek eklemek

        Integer[] arr= {2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        // Bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine arrayList olusturup forloop ile
        // olusturdugumuz List'e tasiyabiliriz.

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        //------------------------------------------------------------------------------------------------------------
        // Bu islemi yapmasi icin Java'nin olusturdugu bir method da var ,ancak bu yontemin cok yan etkisi var

        // 1 - Bu sekilde olusturulan List'de add(),remove() gibi size()'i degistiren method'lar KULLANILAMAZ !!

        // 2 - asList() method'u ile olusturulan list ve kaynak olan array birbiri ile ilisik olarak hayatlarina devam
        // ederler. Birinde yaptigimiz degisiklik otomatik olarak digerine de isler.!!!!!

        List<Integer> sayilar2 = Arrays.asList(arr);//int array kabul etmiyor Integer kabul ediyor !!!!!
        System.out.println(sayilar2);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);//forloop ile olusturdugumuz sayilar list'ine 5'i sorunsuz ekledi
        System.out.println(sayilar);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5] 5'i ekledi

        // asList() ile olusturdugumuz sayilar2'ye 5'i ekledik bu sefer ve sonuc !!!
        // sayilar2.add(5);// asList() le olusturdugumuz sayilar2 List'e ekleme yapamiyoruz !!!
        // System.out.println(sayilar2); Exception

        arr[0]=20; // array'de 0 index'ine 20 ekledik
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        // biz sadece array'de degisiklik yapmamiza ragmen sayilar2 list'inde degisiklik yapmamis olmamiza ragmen
        // array'de degisiklik yapinca list'de de degisiyor,list'de degisiklik yapinca array'de de degisiyor.
        System.out.println("array'de degisiklik yapinca sayilar2: "+sayilar2);
    }
}
