package day13_14_methodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //input olarak verilen 4 harfli bir String'i tersten yazdiran bir method olusturalim

        terstenYazdir("erik");

    }

    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)
                +input.substring(2,3)
                +input.substring(1,2)
                +input.substring(0,1);

        System.out.println("verilen kelimenin tersten yazilisi: "+tersInput);
    }
}
