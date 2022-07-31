package day36_inheritanceDataTypeKullanimi.personel;

public class YanHizmetliler extends Muhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas(){

        System.out.println("YanHizmetliler : "+(30*saatUcreti*gunlukMesai)+" maas alir.");
    }

    protected void issizlikSigortasi(){

        System.out.println("YanHizmetliler %30 indirimli issizlik sigortasi yaptirabilirler.");
    }

    public static void main(String[] args) {

        /*
        =====> Overriding <======
        Child class'daki bir method'un parent class'daki ayni isimdeki
        bir method'u etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir.

        ====> Overriding'i nerede dikkate aliyoruz ?
        Bir obje olusturulurken data turu ve constructor farkli ise !!!!

        Eger bir obje olusturulurken data turu ve constructor farkli ise objenin ozelliklerini
        belirlerken 3 konuya dikkat cekmeliyiz

        1 - Obje constructor'in oldugu class'da olusur.

        2 - Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz.Bu class'da
        aranan ozellik bulunamazsa parent class'lara bakilir,orada da bulamazsak CTE verir.

        3 - Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
        * Aranan ozellik method ise, degeri yazdirmadan once override edilmis mi diye kontrol etmemiz gerekir.
        * Eger override edildiyse en guncel degeri yazdiririz.
         */

        Muhasebe yanHizmetli1 = new YanHizmetliler();

        System.out.println("yanHizmetli1.gunlukMesai = " + yanHizmetli1.gunlukMesai); // 8 Muhasebe Parentten
        System.out.println("yanHizmetli1.saatUcreti = " + yanHizmetli1.saatUcreti);// 10 Muhasebe

        yanHizmetli1.maas();//YanHizmetliler : 2160 maas alir.Overriding Muhasebeden degil bu class'takini calistirdi.
        yanHizmetli1.ozelSigorta();//Isteyen calisanlara %50 indirimli ozel sigorta yapilir. Muhasebeden
        yanHizmetli1.sigorta();// Tum personelimize sigorta yapilir. Personel

        System.out.println("yanHizmetli1.isim = " + yanHizmetli1.isim);// Personel
        System.out.println("yanHizmetli1.soyisim = " + yanHizmetli1.soyisim);// Personel
        System.out.println("yanHizmetli1.departman = " + yanHizmetli1.departman);// Personel

        // System.out.println(yanHizmetli1.issizlikSigortasi); aramaya muhabeden basladigimiz icin
        // kendi class'inda olmasina ragmen CTE verir cunku aramaya Muhasebeden basladi ve onun parent'i
        // Personel'e bakti orda da yok geriye donuk kontrol edemeyecegi icin hata verir.

    }
}
