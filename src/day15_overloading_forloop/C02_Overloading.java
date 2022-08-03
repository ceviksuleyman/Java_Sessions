package day15_overloading_forloop;

public class C02_Overloading {

    public static void main(String[] args) {


        topla(7, 3);
        topla(5.3, 4);//bir double ve bir integer'in toplami: 9.3
        topla(3.5, 7.4);//iki double'in toplami: 10.9

    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integerin toplami: " + (sayi1 + sayi2));

    }
      /*
      -> Bir class'da parametre sayisi ve parametre turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla(int sayi3,int sayi4){
        System.out.println("iki integerin toplami: "+(sayi4+sayi3));
    }   */

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami: " + (sayi1 + sayi2));

    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("bir integer ve bir double'in toplami: " + (sayi1 + sayi2));

    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki double'in toplami: " + (sayi1 + sayi2));

    }
}
