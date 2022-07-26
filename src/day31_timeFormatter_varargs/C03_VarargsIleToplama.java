package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {

    public static void main(String[] args) {
        // Verilen kac int olursa olsun hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }

    /*
     * int...sayi bu gosterim integer variable'lardan olusan bir varargs demektir.Varargs array altyapisini kullanir.
     * varargs tek method'da istedigimiz kadar sonuc almamizi saglar,yani parametre sayimiz degisken ancak method'un
     * yapacagi is sabitse Varargs kullanarak tek method'la kodumuzu yazabiliriz
     * Varargs ozellik olarak list gibi calisir(uzunluk esnektir) fakat arka planda Java array ile calisir.*/
    private static void toplaYazdir(int...sayi) {

        int sum = 0;
        int sayiAdedi = sayi.length; // array olarak aldigi icin length
        for (int w : sayi
             ) {
            sum += w;
            // sayiAdedi ++; sayi adedini bu sekilde de alabiliriz
        }
        System.out.println(sayiAdedi+" sayinin toplami : "+sum);

    }
}
