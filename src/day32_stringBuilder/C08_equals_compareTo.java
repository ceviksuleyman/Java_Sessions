package day32_stringBuilder;

public class C08_equals_compareTo {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");


        String str = "Java";

        System.out.println("sb1.equals(sb2) = " + sb1.equals(sb2)); // false

        // StringBuilder'da equals method'u ancak ayni obje olursa true doner.
        // String'deki gibi dusunmemek gerek..
        // StringBuilder ve String'de == yapilamaz !!!!!!!! CTE
        System.out.println("sb1.equals(sb1) = " + sb1.equals(sb1)); // true

        System.out.println("sb1.equals(str) = " + sb1.equals(str)); // false



        /* --------------- compareTo() ------------------
        iki StringBuilder'a bastan baslayarak harf harf karsilastirir,ilk harfler ayni ise ikincilere ,ikinci harfler
        ayni ise ucuncuye gecer ve ilk farkli olan harf olana kadar ve farkli olan 2 harfin ascii codlari arasindaki
        farki bize dondurur.
        Eger hic farkli harf yoksa 0(sifir) dondurur.*/

        System.out.println("sb1.compareTo(s2) = " + sb1.compareTo(sb2));// 0

        StringBuilder sb3 =new StringBuilder("Jave");

        System.out.println("sb1.compareTo(sb3) = " + sb1.compareTo(sb3));// -4




    }
}
