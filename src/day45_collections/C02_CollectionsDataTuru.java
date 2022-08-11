package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {

        List<Object> liste = new ArrayList<>();
        liste.add(5);
        liste.add('a');
        liste.add(true);
        liste.add("Ali");
        liste.add(5.5);
          /*
        Collections <dataTuru> nu Object secmeniz durumunda Collection'a farkli data turlerinden
        objeler koymamiza izin verir.

        Bu depolama acisindan bize esneklik saglar, ancak islem yaparken tum objeleri Object
        olarak tanimladigimizdan cok fazla casting yapmamiz gerekebilir.
         */

        System.out.println("liste = " + liste); // liste = [5, a, true, Ali, 5.5]

        liste.set(0, (Integer) liste.get(0) + 5); // 5 + 5 = 10

        System.out.println("liste = " + liste); // liste = [10, a, true, Ali, 5.5]

        liste.set(3, liste.get(3) + "Can"); // Ali + Can = AliCan

        System.out.println("liste = " + liste); // liste = [10, a, true, AliCan, 5.5]

        liste.set(2, !(Boolean) liste.get(2)); // true => false

        System.out.println("liste = " + liste);// [10, a, false, AliCan, 5.5]


        Set<Object> set = new HashSet<>();

        set.add("Java");
        set.add('a');
        set.add(false);
        set.add(545.34);

        System.out.println("set = " + set); // set = [Java, a, false, 545.34]

    }


}
