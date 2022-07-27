package day33_encapsulation;

public class ArabaRun {

    public static void main(String[] args) {

        Araba araba1 = new Araba();

        //araba1 objesi uzerinden marka variable'na ulasabildim,degistirebildim(set) ve yazdirabildim(get)
        araba1.marka = "Toyota";
        System.out.println("araba1.marka = " + araba1.marka);

        // access modifier kullanarak marka variable'ina ulasimi tamamen serbest yapabilir veya tamamen kisitlayabilirim
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor.

        // model'i degistirelim ama goremeyelim
        // yakit'i da gorelim ama degistiremeyelim.

        /* set ve get yetkilerini ozel olarak tanimlamak isterseniz (Encapsulation)
         1.adim=> ozel yetki tanimlayacaginiz variable'lari private yapin, private bir dataya baska class'lardan ulasmak
         mumkun olmadigindan
         2.adim=> set yetkisi icin setter, get yetkisi icin getter methodlari(public) olusturalim */

        araba1.setModel("corolla");// model olarak suprayi atadik
        // modeli yazdirma imkanimiz yok,cunku getter method'u yok

        System.out.println("araba1.getYakit() = " + araba1.getYakit());// Eletrikli
        // yakiti degistiremeyiz cunku setter method'u yok.

    }
}
