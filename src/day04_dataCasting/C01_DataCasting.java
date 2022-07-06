package day04_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {
        char harf1='a';
        char yeniHarf=(char) (harf1+1); //b        //char yeniHarf = harf1+1;  kod budurumda once sagdaki islemi yapar
                                              // char yeniHarf = 97+1 yapardı
                                             // char bir variebla 98 olamayacagindan java hata verir
        System.out.println(yeniHarf); //char yeniHarf=(char) (harf1+1); 98 in Ascii degerinin tersini aldı char yaptı

        int sayi1=(int) 7.3;          //bazen bir variebla'a olusturuldugu data turu dısından deger atanabilir bunlardan
        System.out.println("sayi1= " +sayi1);//7
                                                           // bazisini java otomatik olarak kabul eder..
        double sayi2= 10;
        System.out.println("sayi2= " +sayi2); //10.0

        int sayi3 = 'c';
        System.out.println("sayi3= " +sayi3); //99

        char harf2 = 98;
        System.out.println("harf2= " +harf2); //b


    }
}
