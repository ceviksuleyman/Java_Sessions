package day15_overloading_forloop;

public class C06_ForLoop {

    public static void main(String[] args) {

        C05_StringTerseCevirme.terstenYazdir("muhterem");
        /*
        100'den 1'e kadar(dahiller) 8 ile bolunebilen sayilari yazdirin
         */

        for (int i = 100; i >= 1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
