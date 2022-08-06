package day41_abstractClass;

public class C05_MercedesA160 extends C03_Mercedes{

     /*
    Abstract parent silsilesinden gelen ilk concrete class Parent'i olan tum
    class'lardaki abstract method'lari concrete hale donusturmek(override)
    zorundadir.
    Bu kuralin istisnasi parent class'lardan herhangi birinde concrete hale
    donusturulmus,abstract method'lardir.
     */

    /*
    Mercedes class'inda abstract olan Araba parent'ten butun
    abstract methodlar'i override ettigimiz icin Mercedes'in child class'i
    olan bu class'da abstract method'lari override etme mecburiyeti yoktur.
     */


    public static void main(String[] args) {

        C05_MercedesA160 araba1 = new C05_MercedesA160();
        //concrete bir class'dan istedigimiz objeyi uretebiliriz.

        C03_Mercedes araba2 = new C03_Mercedes();
        // mercedes'te concrete


        C02_Toyota araba3 = new C02_Toyota() { // Abstract class'lar constructor barindirir ama obje uretemezler.
            @Override                          // Toyota class'i abstract class oldugundan obje uretilemez.
            protected void yakit() {
            }

            @Override
            protected void kaporta() {
            }
        };


        //List<String> list1 = new List<String>();
        //List<String>  list2 = new ArrayList<>();

        C02_Toyota araba4 = new C04_Corolla();
        C01_Araba araba5 = new C03_Mercedes();

        /*
        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        data turunu istedigimiz abstract class,constructor'i ise child'i olan concrete
        bir class'dan seceriz.
         */

    }
}
