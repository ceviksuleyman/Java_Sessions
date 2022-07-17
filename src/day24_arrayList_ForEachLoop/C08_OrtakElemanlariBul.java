package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBul {

    public static void main(String[] args) {

        //Soru 3: iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For each loop kullanarak bulunuz.
        //Sonucu ekrana yazdiriniz.Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] arr1 = {"Ali","Veli","Can","Ayse"};
        String[] arr2 = {"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsimler = new ArrayList<>(); // list olusturduk ortak olanlari bu liste aticaz

        for (String each1:arr1) {

            for (String each2:arr2) {

                if (each1.equalsIgnoreCase(each2)) {

                    ortakIsimler.add(each1);
                }
            }
        }
        if (ortakIsimler.isEmpty()) {

            System.out.println("ortak eleman yok");

        }else {

            System.out.println("her iki array'deki ortak isimler: "+ortakIsimler);
        }

    }
}
