package day35_inheritancedaConstructorOlusturma.personel;

public class Memur extends Muhasebe {
    /*
    "extends" keyword kullanilan class'larda ister default constructor bulunsun istersek de
    biz yeni constructor(lar) olusturalim Java constructor'in ilk satirina super(); constructor call yazar.

    super(); constructor call ,default constructor'a benzer gorunmese de orada vardir ve calisir.
    Ancak biz ilk satira farkli bir constructor call yazarsak Java super(); constructor'i siler.

    Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak Java'nin default olarak
    olusturdugu constructor call herzaman parametresizdir.
     */

    Memur(){

        System.out.println("Memur parametresiz constructor.");

    }
    Memur(String isim){

        System.out.println("Memur parametreli constructor.");

    }
    public static void main(String[] args) {

        Memur memur1 = new Memur(); //default super(); parametresiz oldugu icin parentlerden parametresizleri yazdirdi.

    }
}
