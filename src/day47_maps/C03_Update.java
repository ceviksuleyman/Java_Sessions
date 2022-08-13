package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C03_Update {
     /*
     map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner.

     map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner.

     ONEMLI NOTE ==> map.contains(value), value'nin icindeki bir parcayi bulmada ise yaramaz.

     Eger value icindeki bir parcayi aratmak istiyorsak map uzerinde manipulation yapmamiz gerekir.

     map.get(key) ==> verilen key'e ait degeri dondurur.
     */

    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(111)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false

        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim.
        // Map'lerde replace() tum value'yu degistirmek istersek kullanilabilir,kismi degisikliklerde kullanilamaz.

        sinifListMap.replace(107, "Derya, Cem, Tester", "Suleyman, Cevik, Tester");

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz.
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin herbir key'e ve ona ait value'ya ihtiyacim var.

        Set<Integer> keySeti = sinifListMap.keySet();

        String wValue;

        for (Integer w : keySeti) {

            wValue = sinifListMap.get(w);
            wValue = wValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(w, wValue);
            /*
            Biz key'lerin tamamini aldik,herbir key'in value'sunu get'irdik value uzerinde degisikligi
            yapip yeni halini  put(key,yeniDeger) ile map'a koyduk.
             */
        }
        System.out.println(sinifListMap);

    }
}
