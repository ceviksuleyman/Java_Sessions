package day29_passByValue_immutable;

public class C05_Immutable {

    public static void main(String[] args) {

        /*
        NOTE ==> Immutable class'dan olusturulan objeler de immutable olurlar.
        Ornek String str, str String class'indan bir objedir ...
        Bu tur bir obje olusturabiliriz fakat onlari degistiremeyiz.
        Immutable objeyi degistirmek istersek , Java o objeyi klonlar ve yapilan degisiklikleri klonlanmis
        yeni obje uzerinde gerceklestirir.
         */
        String isim = "Mine";

        isim = isim.toUpperCase(); // isim kalici olarak degisti yeni obje olusturulmus oldu assign var

        System.out.println(isim); // MİNE

        isim = "Mevlut";

        System.out.println(isim);// Mevlut

        for (int i = 0; i < 100; i++) {

            isim +=".";
        }

        System.out.println(isim);

    }
}
