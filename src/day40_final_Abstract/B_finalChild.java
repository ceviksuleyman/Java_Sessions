package day40_final_Abstract;

final public class B_finalChild extends A_final {

    public static void main(String[] args) {

        B_finalChild obj1 = new B_finalChild();

        obj1.isim = "Cuneyt";

        System.out.println(obj1.isim);

        //obj1.okulIsmi ="Murtaza Okul"; final oldugu icin degistirme sansim yok

        System.out.println(A_final.OKUL);

        System.out.println(Integer.MAX_VALUE);
        /*
        Bir class final olarak belirlenirse o class inherit edilemez.
         */
    }
}
