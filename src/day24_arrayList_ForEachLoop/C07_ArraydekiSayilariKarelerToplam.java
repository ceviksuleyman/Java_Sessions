package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ArraydekiSayilariKarelerToplam {

    public static void main(String[] args) {

        //Soru 2:Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini
        // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int[] sayilar = {2,3,4,1,5,7,6,5,4,3};

        int toplam = 0;

        for (int each:sayilar) {

            toplam += each*each;

        }
        System.out.println("array durumda kareler toplami: "+toplam);


        //----------------------------------------------------------------------------------------------------------

        int sum = 0 ;

        List<Integer> sayilarList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) { //sayilar array'ini sayilarList'ini cevirdik loop ile

            sayilarList.add(sayilar[i]);
        }

        System.out.println("Sayilar array'ini list'e cevirdik : "+sayilarList);

        for (Integer sc: sayilarList) {

            sum += sc*sc;
        }
        System.out.println("ArrayList durumda kareler toplami : "+sum);

    }

}
