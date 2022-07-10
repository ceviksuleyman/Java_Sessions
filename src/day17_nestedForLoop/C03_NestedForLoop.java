package day17_nestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {
        /*
        verilen iki yukseklik ve boy degerine gore *'lardan olusan bır dikdortgen olusturun
          yukseklik=3
          boy=4
          * * * *
          * * * *
          * * * *
        */

        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {     //  satir sayisi

            for (int j = 1; j <=boy ; j++) {     // satirin uzunlugunu belirler

                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
