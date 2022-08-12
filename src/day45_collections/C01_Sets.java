package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Sets {
    /*
    Set (interface), matematikteki kume mantigi ile calisir,her element unique(benzersiz)'tir.
    Index yapisi yoktur.

    Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.

    Set direk kullanilamaz interface'dir ve Constructor'i yoktur,3 child class'indan bizim icin
    onemli ozellige gore istedigimizi kullanabiliriz.(HashSet,LinkedHashSet,TreeSet)

    HashSet =>
    Elemanlari icin bir siralama yapmaz.Elemanlari yazdirdiginizda veya cagirdiginizda
    herhangi bir siralama ile gelebilir.
    Duplication'a izin vermez,eger bir elemani tekrar eklemek isterseniz eski olani silip,
    yeni olan uzerine yazilir.
    Null degere izin verir, birden fazla null degerini HashSet'e eklemek isterseniz sadece bir tane
    null degeri olur.

    LinkedHasSet =>
    1 - Tekrarli eleman kabul etmezler.
    2 - Elemanlari ekleme sirasina(insertion order) gore dizerler.
    3 - Ekleme ve remove islemlerinde hizlidirlar.
    4 - LinkedHashSet,HashSet'ten yavastir.

    TreeSet =>
    1 - Ekleme sirasini korumaz,elemanlari naturel order'a gore siralar, bu yuzden HashSet'e gore daha yavastir.
    2 - Tekrarli eleman kabul etmez.

     */
    public static void main(String[] args) {

        // Verilen bir array'deki tekrar eden elementleri silip tekrarsiz halini array'a atayan bir kod yazin.

        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6, 5, 7, 5, 2, 3, 1, 5, 7, 5};

        System.out.println("ilk hali (arr) : " + Arrays.toString(arr));

        Set<Integer> uniqueSet = new HashSet<>();

        for (int w : arr
        ) {

            uniqueSet.add(w);
        }
        //System.out.println("uniqueSet : " + uniqueSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] uniqueArr = new int[uniqueSet.size()]; // array

        int index = 0;

        for (Integer w : uniqueSet
        ) {

            uniqueArr[index] = w;
            index++;
        }
        //System.out.println("uniqueArr : " + Arrays.toString(uniqueArr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr = uniqueArr; // yeni array'i eski array'e atadik.

        System.out.println("Tekrarsiz son hali (arr) : " + Arrays.toString(arr));

    }

}
