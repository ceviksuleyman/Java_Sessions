package day39_exceptions;

public class C03_Exceptions {

    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);

        } catch (NumberFormatException e) {

            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir.");

        } catch (Exception e) { // en genis

            System.out.println("Ongurelemeyen bir hata olustu");
        }

        System.out.println("Sayinin karesi : " + sayi * sayi);
        /*
        Kullanicidan String olarak bir deger aliyor ve bunu integer'a ceviyorsak NumberFormatException ile
        karsilasabilecegimizi ongoruruz.
        NumberFormatException aldigimizda kodun durmamasini istiyorsak try-catch ile cevreleyebiliriz.

        Eger bilmedigim bir exception daha olusursa kodum durmasin istiyorsak bir kere daha catch body'si
        ekleyip ona en genis Exception'i yazabiliriz.
         */

        /*
        NOTE ==>
        1 - Compile Time(Checked) Exception : Kod yazildiginda Java'nin ongordugu olasi sorunlar.
        Java olasi bir problem gordugunde kirmiz cizgi ile bizi uyarir.(Her kirmizi cizgi Exception DEGILDIR).
        FileNotFoundException,IOException..

        2 - Run Time(UnChecked) Exception : Kod calistiginda ortaya cikan exceptionlar.
        ArithmeticException..
         */
    }
}
