package day46_maps;

import java.util.*;

public class _Maps {

    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        sinifList.put(105, "Buse, Naz, Tester");

        // for loop ile
        List<String> list = new ArrayList<>((sinifList.values()));

        List<String> isimListesi = new ArrayList<>();

        String[] valuesArr;

        for (int i = 0; i < list.size(); i++) {

            valuesArr = list.get(i).split(",");

            isimListesi.add(valuesArr[0] + valuesArr[1]);

        }

        System.out.println(isimListesi); // [Ali Can, Enes Cem, Taha Emre, Derya Deniz, Buse Naz]

        int s = 1;
        for (String w : isimListesi
        ) {
            System.out.println(s + " - " + w);
            s++;
        }

    }
}
