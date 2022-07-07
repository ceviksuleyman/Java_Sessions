package day18_while_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {
        /*
        Kullanicidan  baslangic ve biris harfini alin ,baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyut="";

        while (temp <= sonHarf) {

            buyut=(temp+"").toUpperCase(); //char degiskeni method ile buyuk harf yapamayiz bu yuzden String degiskene
                                           //atamak icin hiclik"" ekleyip method uyguladik...

            System.out.print(buyut+" ");
            temp++;  //f den baslayip  t ye kadar gitmesi icin ++  !
        }
    }
}
