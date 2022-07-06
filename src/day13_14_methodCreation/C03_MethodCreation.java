package day13_14_methodCreation;

public class C03_MethodCreation {

    public static void main(String[] args) {

         /*
        Verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim
         */

        int input=423;

        rakamlariTopla(input);
        C02_MethodCreation.terstenYazdir("kivi");
    }

    public static void rakamlariTopla(int input) {
        int bb=0;
        int rt=0;
        int temp=input;

        bb=input%10;
        rt+=bb;
        input/=10;

        bb=input%10;
        rt+=bb;
        input/=10;

        bb=input%10;
        rt+=bb;

        System.out.println("Girilen "+temp+" sayisinin rakamlar toplami: "+rt);

    }
}
