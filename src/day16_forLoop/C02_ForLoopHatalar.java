package day16_forLoop;

public class C02_ForLoopHatalar {

    public static void main(String[] args) {

        /*
        Baslangic noktasindan sonra bitis sartina yaklasmiyorsak sonsuz loop olusur
        */

        for (int i = 0; i >-10 ; i--) {  // i++ yaparsak bu sonsuza kadar gider

            System.out.print(i+" ");

        }


        for (int i = 0; i >5 ; i++) {   // eger ilk deger icin bile bitis sarti saglanmiyorsa for loop calisir
                                        // ama loop body'si devreye girmez(calismaz) loop is broken
            System.out.print(i);
        }




    }
}
