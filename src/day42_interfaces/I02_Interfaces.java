package day42_interfaces;

public interface I02_Interfaces {

    int SAYI = 30;

    void yakit();

    /*
    interface icerisindeki her method public ve abstract ozelliklerine sahiptir.
     */

    public void motor();

    public abstract void teker();

    /*
    Abstract bir method'un body'si olmasi mumkun degildir.

    Java sonradan developer'larin istegi uzerine kismi bir update yapmistir.

    Bir interface'e sonradan bir abstract method eklerseniz o interface'i
    daha once implement etmis tum class'lara gidip hepsinde yeni eklenen
    method'u override etmeniz gerekir.

    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

    Bunun icin Java Java8'den itibaren interface'lere sonradan body'si
    olan method eklenmesine izin vermistir.

    Bu method'larin body'si olsa'da interface'in yapisi geregi bu method'lara
    concrete denmez.

    Body'si olan bu method'lar istisna olarak kabul edilebilir.
    static void aku() { }
    */
}
