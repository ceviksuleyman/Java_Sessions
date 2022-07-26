package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdir {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","PapuaYeniGineli","Podoso Cumhuriyeti");

    }

    /* Varargs ozellik olarak list gibi calisir(uzunluk esnektir) fakat arka planda Java array ile calisir.*/
    private static void enUzunKelimeyiYazdir(String...kelime) {

        String enUzunKelime = kelime[0];

        for (String w : kelime) {

            if (w.length() > enUzunKelime.length())  {

                enUzunKelime = w;
            }
        }
        System.out.println("En uzun kelime : " +enUzunKelime);

    }
}
