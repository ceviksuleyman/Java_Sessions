package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    //--------- Onceki Dersten Aklimizda Kalanlar -----------------------------
    /*
    1- immutable Class ; degistirelemeyen class demektir.Bu class'dan olusturulan objeler de immutable olurlar.
    2- Bugune kadar kullandigimiz class'lardan immutable olan en mushur olan class String class'idir.
    3- String class'indan olusturdugumuz objelerde, String method'lari calistirdigimizda,objemiz degismez.
         String str = "Java Candir";
         str.toLowerCase();
         str.replace("Java","C#");
         str.substring(0,2);
         Sout(str) => "Java Candir"
         O method'lar calistirildiklari satirda str'in bir kopyasi uzerinde calisirlar ve o kopya uzerinde degisiklikler
     yaparlar.O satirda yazdirir veya bir String variable'a atama yaparsak, method'un sonucunu yazdirir veya atama
     yaparlar. Ancak o satir gectikten sonra str yazdirdigimizda degismedigini gorururuz.
     4- String method'larinda yasadigimiz bu durum mutable olan Arraylist,Array,StrinBuilder'da yasanmaz.Onlarda method
     calistiginda yapilan degisiklikler kalici olur.
     */

    public static void main(String[] args) {

        List<String>  list = new ArrayList<>();
        list.add("Suleyman");
        list.add("Cevik");
        list.add("Murtaza");
        System.out.println(list);// [Suleyman, Cevik, Murtaza]

        list.set(1,"Mahmut");
        System.out.println(list);// [Suleyman, Mahmut, Murtaza]

        list.remove("Suleyman");
        System.out.println(list);// [Mahmut, Murtaza]
    }
}
