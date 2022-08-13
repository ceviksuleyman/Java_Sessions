package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
     /*
     Java Entry<K,V> map'in icerisinde bulunan her bir kaydi key=value seklinde tutar.

     Dolayisiyla herhangi bir Entry'e ulastigimizda hem key'e hem de value'ya ulasabilir
     ve istedigimiz islemleri yapabiliriz.

     entry.getKey() => bize key'i getirir.
     entry.getValue => value'yu getirir.
     entry.setValue => value'yu istedigimiz deger olarak update eder.
     */

    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        // Map'in her bir elemanini alt alta yazdirin.

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer,String> w : sinifEntrySet){

            System.out.println(w);
        }

        // Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim.

        String wValue;

        for (Map.Entry<Integer,String> w : sinifEntrySet){

            wValue = w.getValue();
            wValue = wValue.replace("Tester","QA");
            w.setValue(wValue);

        }
        System.out.println(sinifEntrySet);
        System.out.println(sinifListMap);


    }
}
