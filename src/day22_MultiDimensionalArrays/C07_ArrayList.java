package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {
        //List<int> sayilar = new ArrayList<>();
        //List primitive data turlerini kabul etmez(type argument cannot be of primitive type)

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);// [5, 3, 7]
        //sadece add() kullanirsak java ekledigimiz siraya gore ekler,en son eklenen en sona eklenir.

        sayilar.add(2,10); // index 2'ye 10 yazar
        System.out.println(sayilar);// [5, 3, 10, 7]
        // add(index,element), istedigimiz index'e istedigimiz elementi yerlestirir add method'u eski elementleri
        // silmez veya update etmez, yeni element ekler.



    }
}
