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

        deque.removeLastOccurrence("Selim"); // sondaki Selimi sildi

        System.out.println("deque = " + deque);// [Cavidan, Mesut, Selim, Tevfik]


    }
}
