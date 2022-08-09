package day43_interface_iterator.interfaces;

public interface InterfaceBodyliMethod {

    void motor();

    public void yakit();

    public abstract String aku();

    /*
    Normal bir class'da oldugumuzu dusunursek iki tane access modifier
    kullanma ihtimali OLAMAZ.
     */
    /*
    Asagidaki method'da gorecegimiz gibi interface'de istisnai olarak body'si
    olan method'lar olusturulabilir.

    Bu ozellik Java 8'den sonra kullanilmaya baslamistir.

    Bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip yeni eklenen
    method'u override etmemiz gerekirdi.

    Bu ozellik sayesinde basina default veya static keyword ekleyerek interface'de
    yeni ve body'si olan bir method olusturursak bu method'un child class'lar
    tarafindan override edilme MECBURIYETI YOKTUR.Ve eskiden implement etmis
    class'lari degistirmemiz gerekmez.

    Bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz.

    Bu method'larin body'si olsa da bunlara concrete method denmez ama override
    edilme mecburiyetleri yoktur.

    Buradaki default kelimesi access modifier degil ististani durumun belirtilmesi
    icindir.
     */
    public default void teker() {

        System.out.println("default Tum arabalarin tekeri vardir.");
    }

    /*
    O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci,child class'lardan bu method'a nasil
    erisilebilecegini belirlemek icindir.

    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur.

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */
    public static void direksiyon() {

        System.out.println("static Tum arabalarin direksiyonu vardir.");
    }
    // NOTE ==> interface'de olusturulan method'u static veya default yaparsaniz
    // MUTLAKA body eklemek ZORUNDASINIZ. Bu onu concrete method yapmaz.(istisnai)
}
