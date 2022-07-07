package day18_while_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin.
         */

        int sayi=2343241;

        int rakamtoplami=0;
        int birlerBas=0;
        int temp=sayi;


        while (temp > 0) {

            birlerBas=temp%10;
            rakamtoplami+=birlerBas;
            temp/=10;
        }
        System.out.println(sayi+" sayisinin rakamlar toplami: " +rakamtoplami);

    }
}
