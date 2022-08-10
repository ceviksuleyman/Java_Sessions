package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {

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
