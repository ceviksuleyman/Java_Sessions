package day07_ifStatements;

public class C01_AndOperators {

    public static void main(String[] args) {


        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 &&c>=b); // true

        System.out.println(a<0 && b<20 && c>=b); // bir tane false var sonuç false olur

        //java and operatoru konusunda bize iki secenek sunar
        //&& kullanirsak,ilk false buldugunda artik sonucun false olacagini bilir ve geriye kalan
        //sartları incelemez

        // & kullanirsak tum sartları kontrol eder sonra sonucu belirler
        //bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir...

        System.out.println(a<0 & b<20 & c>=b);// false


    }
}
