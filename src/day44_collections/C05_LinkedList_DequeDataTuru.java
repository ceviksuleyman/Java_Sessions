package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {

    /*
    Deque (Double Ended Queue)
    Queue'larda FIFO gecerliydi, Deque'lerde hem FIFO hem de LIFO(Last in First out) gecerlidir.

    Deque bir interface'dir dolayisiyla constructor'i yoktur.LinkedList constructor'i kullanilarak
    deque olusturulabilir.

    Deques do not accept Null as an element(Deques, Null'u bir öğe olarak kabul etmiyor).

    Deque'de ilk ve son eleman onemli oldugu icin ilk ve son elemana ozel bircok method vardir.
    */
    public static void main(String[] args) {

        //Deque'de hem bastan hem sondan ekleme silme yapilabilir.

        Deque<String> deque = new LinkedList<>();

        deque.add("Cavidan");
        deque.add("Mesut");
        deque.add("Selim");
        deque.add("Tevfik");
        deque.add("Selim");

        System.out.println("deque = " + deque); // deque = [Cavidan, Mesut, Selim, Tevfik, Selim]

        deque.removeLastOccurrence("Selim"); // sondaki Selimi sildi
        deque.removeFirstOccurrence("Hasan"); // Hasan olmadigi icin silemedi.

        System.out.println("deque = " + deque);// [Cavidan, Mesut, Selim, Tevfik]

        System.out.println("deque.pop() = " + deque.pop()); // Cavidan
        // pop(), listenin ilk elemanini siler,ve bize dondurur.Liste bos olursa exception firlatir.

        // Deque iki tarafli queue demektir,dolayisiyla her method'un first ve last'i vardir.

        System.out.println("deque = " + deque);// [Mesut, Selim, Tevfik]
        deque.removeLast(); // Tevfik sildi sondan
        System.out.println("deque = " + deque);// [Mesut, Selim]
        deque.removeFirst(); // Mesut sildi bastan
        System.out.println("deque = " + deque);// [Selim]
        deque.remove(); // Selim sildi
        System.out.println("deque = " + deque); // []


    }
}
