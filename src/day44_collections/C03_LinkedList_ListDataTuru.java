package day44_collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList_ListDataTuru {
    /*
    LinkedList (Class)'dir
    1 - Ilk eleman her zaman head'dir ve head'de data yoktur,sadece adres vardir.
    2 - Son elemman(tail) null'i point eder.
    3 - Her elemanin icinde data ve adres kismi olmak uzere iki kisim vardir.
    4 - Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
    5 - Her eleman 'node' olarak adlandirilir.
    6 - Pointer yapisindan dolayi bir elemana ulasmada yavastirlar.
     */

    /*
    LinkedList 2 interface'in child class'idir.(List , Deque is A Queue)

    Obje olustururken data turu olarak istedigimiz paren interface'i secebilir ve
    o interface'deki ozellikleri kullanabiliriz.
     */

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        List<String> list = new LinkedList<>();


        list.add("Berk");
        list.add("Done");
        list.add("Enes");
        list.add("Ayse");
        System.out.println("list = " + list); // [Berk, Done, Enes, Ayse]


        System.out.println(list.remove(3));// Ayse -> sildigi elemani bize getirir.
        /*
        Eger list'imiz Integer elementlerden olusuyorsa direk sayi yazarsak index olarak
        kabul eder.
        Bir variable'a atama yapar ve remove'da o variable'in ismini yazarsak obje olarak kabul eder.
         */
        System.out.println(list.remove("Kemal")); // false -> listede olmadigi icin

        System.out.println(list.isEmpty());// false -> list bos mu

        list.set(1,"Serap"); // index 1'e Serap ekledik Done silindi
        System.out.println("list = " + list); // [Berk, Serap, Enes]


        linkedList.add("Berk");
        linkedList.add("ismail");
        System.out.println("linkedList = " + linkedList); // [Berk, ismail]

        list.retainAll(linkedList); // list'deki tum  elementleri linkedlist ile karsilastirir.
                                    // linkedlist'te olmayanlari sildi. Ortak olan elemani birakti.

        System.out.println("retainAll' dan sonra list = " + list);// [Berk] -> Ortak eleman


        System.out.println("list.hashCode() = " + list.hashCode()); // 2066939
        // non-primitive obje icin uretilen hashCode'u verir
        list.add("Fatih");
        System.out.println("list.hashCode() = " + list.hashCode()); // 131726141


    }
}
