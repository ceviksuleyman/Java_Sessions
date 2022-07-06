package day15_overloading_forloop;

public class C01_Overloading {

    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz method'larin isminin yaptigi islev ile uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java 2 adet substring() method'u veya verilen
        String'deki bazi parcalari yenileri ile degistirmek icin 2 adet replace() method'u var.

        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina parametre sayisi ve
        parametrelerin data turune gore karar verir.
         */

        String str="sdjflsdjlfjsld";
        str.substring(2);
        str.replace('s','w');
        str.replace("f","b");

        /* Overloading-->
        Eger bir class'da ismi ayni fakat parametreleri farkli olan method'lar olusturursak buna denir.
        -Java ayni isim ve ayni parametrelerde birden fazla method olusturulmasina izin vermez,ayni isimle
        birden fazla method olusturmak isterseniz Method Signature'in degistirilmesi gerekir.
         */

        /*
        Ayni isimde ama farkli method'lari olusturmak icin degistirebilecegimiz seyler
        * parametre sayisi,
        * ayni sayida parametreye sahip olsa bile parametrelerin data turleri
        * ayni sayida ve ayni data turunde parametreleri olan method'larda,parametrelerin siralamasi
         */
    }
}
