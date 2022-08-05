package day40_final_Abstract;

public class A_final {

    protected String isim = "Cuneyt";

    final static String OKUL = "Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa baska class'lardan veya icinde
    oldugumuz class'dan bu variable'a baska deger atanmasi mumkun degildir.

    Madem ki degeri degistirilemiyor genelde static de yaparak bu variable'a
    erisim kolaylastirilabilir, ve genelde static final olarak belirlenen
    variable isimleri BUYUK HARF ile yazilir.
     */

    final void finalMethod() {

        System.out.println("final method'lar override edilemez");
        /*
        Bir method'u final olarak isaretlerseniz bu method degistirilemez
        demektir(Override edilemez).
         */


    /*  NOTEs
	 final, finally ve finalize() arasindaki farklar nelerdir?

	 ==> final ve finally keyword'dur ama finalize() method'dur.

	 final : final keyword'u variable'lardan, method'lardan ve class'lardan once kullanilabilir.

	        1) final variable : Bir variable final ise, o variable'a bir kere deger atamasi yaparsiniz
	                          bir daha o degeri degistirmezsiniz.
	        2) final method : Body'si son halde olan methodlardir. Yani body'si degistirilemeyecek olan methodlardir.
	                        final method'lar override edilemezler.
	        3) final class : Child'i olamaz. Inheritance yapilamaz.

	 finally : try-catch den sonra kullanilir.Try block exception uretse de uretmese de finally block icindeki kod calisir.

	 finalize() : Java'da Garbage Collector silmesi gereken data'lari once finalize eder sonra imha eder.
	 */

    }
}
