package day38_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {
           /*
        Bir sorunla karsilasmayi beklediginiz noktalarda if-else ile sorunu yakalayip
        onunla ilgili cozum uretebilirsiniz.
        Ama sorunu her zaman if-else ile cozemeyecegimizden Java try-catch block'lari olusturmustur.
         */
        int a = 1000;
        int b = 50;

        int sayac = 1;

        while (sayac < 100) {

            if (b == 0) {

                System.out.println("islem yapilirken payda 0 oldu,dikkat etmelisiniz");

            } else {
                System.out.println(a / b);
            }

            b--;
            sayac++;

        }
    }
}
