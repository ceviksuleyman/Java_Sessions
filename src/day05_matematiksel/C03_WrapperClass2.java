package day05_matematiksel;

import java.util.Scanner;

public class C03_WrapperClass2 {

    public static void main(String[] args) {

        //Wrapper Class javanin hazır method'lari kullanabilmemiz icin primitive data turlerinin her biri
        //icin actigi class'lardır

        //int--> Integer
        //char--> Character digerleri primitive data turu ile aynı sadece bas harfi buyuk...

        String str="java ile hayat ne guzel";
        System.out.println(str.toUpperCase());//String non-pimitive data turu oldugundan
                                              //hazir method'lar kullanabiliyorduk..

        boolean guzelMi=true;
        //boolean primitive oldugundan hazir method'u bulunmuyor!!!!!!!!

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        String ogrenciNo="123456";

        //kullanicidan bir sifre isteyin ,eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim !!!!

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz...");

        String sifre=scan.nextLine();  //tamamen sayilardan olusan String bir degiskeni
        Integer sifreSayi=Integer.parseInt(sifre); //int e cevirebiliriz....

        System.out.println("Girilen sifre: "+sifre);
        System.out.println("Integer sifre: "+sifreSayi);

        System.out.println("Girilen sifrenin 3 fazlasi: "+(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi: "+(sifreSayi+3));

        //wprapper class'lar ilerde kullanabilecegimiz pek cok faydali method icerir...

    }
}
