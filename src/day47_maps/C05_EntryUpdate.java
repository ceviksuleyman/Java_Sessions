package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {

    public static void main(String[] args) {

        // soyismi Can olanlarin bransini DataSience yapalim

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        //entry'leri alalim

        Set<Map.Entry<Integer, String>> entrySeti = sinifListMap.entrySet();

        String wValue;
        String[] wArr;
        for (Map.Entry<Integer, String> w : entrySeti) {

            wValue = w.getValue();
            wArr = wValue.split(", ");

            if (wArr[1].equals("Can")) {

                wArr[2] = "DataSience";
                w.setValue(wArr[0] + ", " + wArr[1] + ", " + wArr[2]);
            }
        }
        System.out.println(sinifListMap);

    }
}
