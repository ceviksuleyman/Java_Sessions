package day44_collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    /*
    Queue interface'dir dolayisiyla constructor'i yoktur.

    Queue olusturmak icin child class'i olan LinkedList veya PriorityQueue kullanilabilir.

    1 - PriorityQueue constructor'i kullanarak Queue uretirseniz,Java kendisi bir priority(oncelik)
    kurali uretir ve bu kurala gore elementleri dizer.

    Istersek biz kendi Priority(oncelik) kuralimizi uretip o kurala gore dizebiliriz.

    2 - LinkedList constructor'i kullanarak Queue uretirseniz elemanlari insertion(ekleme)
    sirasina gore dizer.

    NOTE => Queue icin ayirici ozellik : Elemanlar sona eklenir ve en bastan silinir.
    Bu sisteme FIFO(first in firs out) denir.
     */

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Adem");
        queue.add("Zeynep");
        queue.add("Hpolat");
        queue.add("Kadir");

        Queue<String> priorityQueue = new PriorityQueue<>(queue);
        System.out.println("priorityQueue = " + priorityQueue); // [Adem, Kadir, Hpolat, Zeynep]

        // queue, kuyruk demektir ,sira onemlidir. Eklenen sona gelir, silinen bastan gider !!

        System.out.println("queue = " + queue); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println("queue.remove() = " + queue.remove()); // Adem -> direkt ilk index'i siler.

        System.out.println("queue.remove(\"Hpolat\") = " + queue.remove("Hpolat")); // true Hpolat'i sildi.

        System.out.println("queue = " + queue); // [Zeynep, Kadir]

        System.out.println("queue.element() = " + queue.element()); // Zeynep
        // element(), ilk elemani getirir,silmez.Queue bossa hata verir.
        System.out.println("queue.peek() = " + queue.peek()); // Zeynep
        // peek(),ilk elementi getirir,silmez.Queue bossa null dondurur.

        Queue<String> queue2 = new LinkedList<>(); //yeni liste bos
        //System.out.println("queue2.element() = " + queue2.element()); // NoSuchElementException
        System.out.println("queue2.peek() = " + queue2.peek());// null
        /*
        peek() ve element() silmeden ilk elementi bize dondurur.Aralarindaki fark liste bos olursa
        peek() null verir,element ise exception firlatir.
         */

        queue.offer("Ahmet");
        queue.offer("Sefa");
        System.out.println("queue = " + queue); // [Zeynep, Kadir, Ahmet, Sefa]
        // offer(), sona ekler


        System.out.println("queue.poll() = " + queue.poll()); // Zeynep - ilk elemani sildi.
        // poll() , remove() gibi calisiyor ilk elemani siler.
        // Aralarindaki fark remove liste bos ise exception verir.
        // poll() liste bos ise null doner.

        System.out.println("queue = " + queue); // [Kadir, Ahmet, Sefa]

        //System.out.println("queue2.remove() = " + queue2.remove()); // NoSuchElementException
        System.out.println("queue2.poll() = " + queue2.poll());// null


    }

}
