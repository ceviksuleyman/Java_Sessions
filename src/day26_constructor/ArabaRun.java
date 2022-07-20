package day26_constructor;

import day25_constructor.C05_Car;

public class ArabaRun {

    public static void main(String[] args) {

        // bir gun onceku C05_Car class'indan obje olusturalim.
        C05_Car car1 = new C05_Car();

        // Farkli bir package'daki bir class'tan obje olusturdugumda access modifier'i de dikkate almaliyiz.
        // C05_Car'da fiyat variable ulasmak icin public yaptik.
        System.out.println(car1.fiyat);

        /*
        Araba Class'indan bir obje olusturdugumda eger default constructor kullanildiysa tum ozellikler icin tek tek
        deger atamak zorunda kaliriz.
         */

        Araba araba1 = new Araba(); // Araba class'indan obje1  default constructor'i kullanarak bir obje olusturduk
        araba1.fiyat = 10000;       // Eger Araba class'inda baska constructorlar olusturursak bu default constructor
        araba1.marka = "Mercedes";  // otomatik silinecegi icin onun yerine parametresiz bir constructor olusturmaliyiz.!
        araba1.model = "C180";
        araba1.yil = 2010;
        System.out.println("Araba1 Bilgileri\n"
                +"Marka : "+araba1.marka+"\n"
                +"Model : "+araba1.model+"\n"
                +"Yil   : "+araba1.yil+"\n"
                +"Fiyat : "+araba1.fiyat);

        /*
          Eger bir objeyi olustururken argumant olarak belirtip o ozellikleri de bir obje olusturmak istersek
        Java itiraz eder.
          Cunku her class'da default constructor vardir ama o da parametresizdir,bizim yeni ve parametreli
        constructor(lar)'a ihtiyacimiz var
         */
        //-------------------------------------------------------------------------------------------------------------
        Araba araba2 = new Araba("BMW","5.20",2011,15000);

        System.out.println("Araba2 Bilgileri\n"
                +"Marka : "+araba2.marka+"\n"
                +"Model : "+araba2.model+"\n"
                +"Yil   : "+araba2.yil+"\n"
                +"Fiyat : "+araba2.fiyat);

        //-------------------------------------------------------------------------------------------------------------
        Araba araba3 = new Araba("Opel","Astra",2014,76000);

        System.out.println("Araba3 Bilgileri\n"
                +"Marka : "+araba3.marka+"\n"
                +"Model : "+araba3.model+"\n"
                +"Yil   : "+araba3.yil+"\n"
                +"Fiyat : "+araba3.fiyat);

        //------------------------------------------------------------------------------------------------------------
        Araba araba4 = new Araba("Audi","A5",2020,55000);

        System.out.println("Araba4 Bilgileri\n"
                +"Marka : "+araba4.marka+"\n"
                +"Model : "+araba4.model+"\n"
                +"Yil   : "+araba4.yil+"\n"
                +"Fiyat : "+araba4.fiyat);


    }
}
