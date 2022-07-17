package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {

    public static void main(String[] args) {
        //Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,kalan elementler ile yeni bir array yapin

        String[] sehirler = {"Istanbul","Ankara","Mersin","Konya","Kastamonu"};

        String istenmeyenHarf = "r";

        List<String> kalanSehirler = new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {


            if (!sehirler[i].contains(istenmeyenHarf)) {

                kalanSehirler.add(sehirler[i]);
            }
        }
        // loop bittiginde istenmeyen harf icermeyen sehirler list'te eklenmis olacak
        System.out.println("kalan sehirler arrayList durumu : "+kalanSehirler);

        //kalansehirler list'ini kalanlarArrayi'ne aktardim
        String[] kalanlarArrayi = new String[kalanSehirler.size()];

        for (int i = 0; i < kalanSehirler.size(); i++) {

            kalanlarArrayi[i]=kalanSehirler.get(i); //arraylist'ten arraya aktardim.
        }

        //kalanlararray'ini sehirler arrayi'ne atadim direk de yazdirabilirdim..
        sehirler=kalanlarArrayi;
        System.out.println("sehirler array'inin son durumu : "+Arrays.toString(sehirler));



        // yeni bir array olusturup list'i ona aktardim bu benim yontem
        //String[] kalanSehilerArrayi = kalanSehirler.toArray(new String[0]);
        //System.out.println(Arrays.toString(kalanSehilerArrayi));
    }
}
