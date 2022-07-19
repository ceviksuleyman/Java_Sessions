package day25_constructor;

public class C01 {

    /*
       Java OOP konsept kullandigi icin olusturulan her bir class'in ihtiyac oldugunda object
    uretebilmesine uygun dizayn etmistir

       Ama her class'dan object uretilmeyebilir,bunun icin ihtiyac halinde kullanilmasi icin her class'da default
    bir Constructor koymustur.
       Bu default constructor class'da obje olusturuldugunda otomatik olarak calisir.
       Ornegin bu class'da constructor gorunmemesine ragmen C02 class'inda icinde oldugumuz C01 class'indan
    bir object uretebildik. bkz.C02_Constructor
     */
    int sayi;
    public  void denemeMethod(){

        System.out.println("C01 den herkese selam ordan geldim.");
    }
                          // =============== OZET OLARAK =================
        /*
        1-Bizim bir object olusturabilmemiz icin mutlaka bir Constructor'a ihtiyacimiz vardir
        2-Biz constructor'a ihtiyacimiz olan ozel parametreleri yazmazsak,Java bizim icin standart bir urun uretir
        ve onu bize yollar.Istedigimiz spesifik ozellikler varsa bunlari parametreler vasitasiyla soylememiz gereklidir.
        3-Bir class'da gorunurde bir constructor yoksa bile aslinda Java oraya bir default constructor koymustur,
        bu ihtiyac halinde class'dan bir obje olusturuldugunda otomatik olarak default constructor'i kullanir.
         */

}
