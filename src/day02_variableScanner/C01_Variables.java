package day02_variableScanner;

public class C01_Variables {
    public static void main(String[] args) {
        /*
         1-farkli 3 data turunde variable olusturun ve bunları yazdırın
         2-isim ve soyisim icin iki farklı variable olusturun ve bunlari
         isminiz: Murtaza
         soyisminiz: Duran seklinde yazdırınız
         3-iki farklı tam sayı data turunde 2 variable olusturun bunların toplamını yazdırın
         4-Bir tamsayi ve bir ondaliklı variable olusturun bunların toplamını yazdirin
         5-char data turunde bir variable olusturun ve yazdırın
         6-Bir tamsayi, bir de char degisken olusturun ve bunların toplamını yazdırın.
         */
        String isminiz="Murtaza Duran";
        System.out.println(isminiz);

        char ilkHarf ='S';
        boolean anlasildiMi = true;
        System.out.println(ilkHarf);
        System.out.println(anlasildiMi);

        String isim ="Suleyman";
        String soyisim="Cevik";

        System.out.println("isminiz:" + isim);
        System.out.println("Soyisim:" + soyisim);

        int a=10;
        short b=20;
        System.out.println(a+b);//30

        //6-Bir tamsayi, bir de char degisken olusturun ve bunların toplamını yazdırın
        int sayi=25;
        char karakter='a';

        //char degiskenler matematiksel isleme sokulursa char degiskenin arındırdiği karakterin
        // ascii degeri isleme girer a=97
        System.out.println(sayi+karakter);//122





    }
}
