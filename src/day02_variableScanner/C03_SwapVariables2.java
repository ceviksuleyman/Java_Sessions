package day02_variableScanner;

public class C03_SwapVariables2 {

    public static void main(String[] args) {
        //verilen sayi1 ve sayi2 variable'larinin degerlerini
        //3. bir variable olmadan degistiren (SWAP) bir program yaziniz
        int sayi1=10;
        int sayi2=20;

        System.out.println("baslangicta  sayi1="+sayi1 + " ve sayi2=" + sayi2); //baslangicta sayi1=15 ve sayi2=20

        //ucuncu bir variable kullanmayacaksak,verilen iki sayinin farkindan yararlaniriz
        //ilk adim olarak sayilarin farkini ilk sayiya assign ediyorum

        sayi1= sayi1-sayi2;

        //ikinci adim fark ile sayi2 yi toplayıp sayi2 ye assign ediyorum

        sayi2= sayi1+sayi2;

        //ucuncu adim olarak sayi1 e sayi2 - fark atiyorum

        sayi1=sayi2-sayi1;

        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);

    }
}
