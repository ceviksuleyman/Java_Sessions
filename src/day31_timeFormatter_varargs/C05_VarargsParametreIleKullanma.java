package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    /* 1- Varargs teorik olarak sonsuz sayida element alabilir.
       2- Bir method'da parametre olarak varargs varsa varargs'in sinirlarini bilebilmesi icin parametrelerin
       sonuncusu olmalidir.
       3- Oncesinde farkli parametreler olabilir ama varargs'dan sonra parametre OLAMAZ.! Bu kuraldan dolayi bir method'da
       sadece 1 tane varargs olabilir.
       => kullanicidan deger alarak varargs calsitirmak istiyorsak girilen degerleri bir array'e kaydetmeliyiz,
       => bunun icin kullanicidan aldiginiz degerleri esnek oldugu icin bir list'e koyariz sonra list'i array'e ceviririz.*/

    public static void main(String[] args) {

        enUzunKelimeyiYazdir(6,"Ali","Ayse","Ismail","PapuaYeniGineli","Podoso Cumhuriyeti","Murtaza");


        new C05_VarargsParametreIleKullanma().Go(1,"Hello");
        new C05_VarargsParametreIleKullanma().Go(2,"Hello", "hi");

    }
    public void Go(int x, String... y){

        System.out.print(y[y.length-x]+" ");

    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String...kelime) {

        String enUzunKelime = kelime[0];

        for (String w : kelime
        ) {
            if (w.length() > enUzunKelime.length())  {

                enUzunKelime = w;
            }
        }
        System.out.println("En uzun kelime : " +enUzunKelime);

    }
}
