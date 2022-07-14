package day21_Arrays;

public class C02_EnUzunVeEnKisaKelime {

    public static void main(String[] args) {
        //Verilen String bir Array'de en uzun ve en kisa String'leri yazdiran bir method olusturun.

        String[] isimler = {"Erdallllll","Onur","Mehmet","Suleyman","Hayrullah"};

        enUzunVeEnKisaKelime(isimler);
    }

    public static void enUzunVeEnKisaKelime(String[] isimler) {

        String enUzunKelime = isimler[0];//ilk index'deki stringleri atadik zaten hepsini kontrol edicek
        String enKisaKelime = isimler[0];

        for (int i = 1; i <isimler.length ; i++) { //ilk index'i zaten atadik o yuzden 1 den basladik..

            if (isimler[i].length() > enUzunKelime.length()) {// >= yaparsak ayni length'deki ikinciyi verir.

                enUzunKelime=isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()) { // <= yaparsak ayni length'deki ikinciyi verir.

                enKisaKelime=isimler[i];
            }
        }
        System.out.println("Array'daki en uzun kelime: "+enUzunKelime);
        System.out.println("Array'daki en kisa kelime: "+enKisaKelime);

    }
}
